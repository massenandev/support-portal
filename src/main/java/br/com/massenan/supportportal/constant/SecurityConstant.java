package br.com.massenan.supportportal.constant;

public class SecurityConstant {
	
	public static final long EXPIRATION_TIME = 432_000_000; // 5 days expressed in milliseconds
	public static final String TOKEN_PREFIX = "Bearer "; // whoever got this token, i dont have to do eny further checks
	public static final String JWT_TOKEN_HEADER = "Jwt-Token"; // sticking to convention // default header
	public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
	public static final String MASSENANDEV = "Massenan, Dev"; // companys name
	public static final String MASSENANDEV_ADMINISTRATION = "User Management Portal";
	public static final String AUTHORITIES = "authorities"; // hold the auth of the user
	public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
	public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
	public static final String OPTIONS_HTTP_METHOD = "OPTIONS"; 
	public static final String[] PUBLIC_URLS = { "/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**" }; // open/allowed urls inside the brackets - no need to authentication
	
}
