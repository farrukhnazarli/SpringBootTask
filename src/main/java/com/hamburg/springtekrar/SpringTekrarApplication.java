package com.hamburg.springtekrar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTekrarApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringTekrarApplication.class, args);
    }

}

//Application context(Spring Container)-Beanlarin saxlandigi yer
//Component scan bizim bean a cevrilmis classlarimizi application context e elave edir
//Bean yaratmaqin usullari:Component ve onun alt annotasiyalari.(Service,Repository,Controller(RestController))
//  //Post,Get,Delete,Put,Patch
//    //DTO-Data transfer object
//Bir bean daxilinde basqa bean i istifade etmek dependency injection adlanir
//Dependency injection:Bir bean daxilinde diger bini istifade etmek.
//3 novu var:Field injection,Setter Injection,Constructor injection
//Field injection tovsiye olunmur.Testing de problem.NullPointer xetasi atma ehtimali yaranir