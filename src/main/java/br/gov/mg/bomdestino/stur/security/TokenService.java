package br.gov.mg.bomdestino.stur.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.gov.mg.bomdestino.stur.modelo.Usuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

	@Value("${stur.jwt.expiration}")
	private String expiration;
	
	@Value("${stur.jwt.secret}")
	private String secret;
	
	public String gerarToken(Authentication authentication) {

		Usuario logado = (Usuario) authentication.getPrincipal();
		Date hoje = new Date();
		
		return Jwts.builder()
				.setIssuer("STUR")
				.setSubject(logado.getId().toString())
				.setIssuedAt(hoje)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

	public boolean isTokenValido(String token) {
		try {
			Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Long getIdUsuario(String token) {
		Claims claims = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
		return Long.parseLong(claims.getSubject());
	}

}
