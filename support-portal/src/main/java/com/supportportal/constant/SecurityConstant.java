package com.supportportal.constant;

public class SecurityConstant {

    public static final long EXPIRATION_TIME = 432_000_000; // 5 days expressed in milliseconds - vreme isteka tokena
    public static final String TOKEN_PREFIX = "Bearer "; // prefiks koji stavljao pre tokena. Koristimo ga kako bi lako verifikovali token
    public static final String JWT_TOKEN_HEADER = "Jwt-Token"; // header za koji cemo zakaciti nas token
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified"; // poruka koju cemo slati ako ne mozemo da verifikujemo token
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC"; // ovo i String ispod koristimo za definisanje firme i aplikacije. Ovo je ime firme
    public static final String GET_ARRAYS_ADMINISTRATION = "User Managment Portal"; // Ovo je ime aplikacije
    public static final String AUTHORITIES = "authorities"; // za njega cemo zakaciti authorities od usera. Sta sme da radi, sta ne
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page"; // Ovo i String ispod su poruke koje cemo slati ako korisnik nema pristup
    public static final String ACCESS_DENIED_MESSAGE = "You do nt have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS"; // HTTP OPTIONS metoda. Kako ne bi non stop pisali koristicemo konstantu
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/image/**"}; // adrese na koje svi imaju pristup
}
