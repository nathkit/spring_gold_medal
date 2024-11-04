package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository <GoldMedal, Integer> {

    List<GoldMedal> getByCountryOrderByYearAsc(String countryName);
    List<GoldMedal> getByCountryOrderByYearDesc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String countryName);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String countryName);
    List<GoldMedal> getByCountryOrderByCityAsc(String countryName);
    List<GoldMedal> getByCountryOrderByCityDesc(String countryName);
    List<GoldMedal> getByCountryOrderByNameAsc(String countryName);
    List<GoldMedal> getByCountryOrderByNameDesc(String countryName);
    List<GoldMedal> getByCountryOrderByEventAsc(String countryName);
    List<GoldMedal> getByCountryOrderByEventDesc(String countryName);

    int countByCountry(String countryName);
    int countBySeason(String season);
    int countByCountryAndGender(String countryName, String gender);

    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String countryName, String season);

    // List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String country, String season);
    // int countByCountry(String country);
    // int countBySeason(String season);
    // int countByCountryAndGender(String country, String gender);
    // List<GoldMedal> getByCountryOrderByYearAsc(String country);
    // List<GoldMedal> getByCountryOrderByYearDesc(String country);
    // List<GoldMedal> getByCountryOrderBySeasonAsc(String country);
    // List<GoldMedal> getByCountryOrderBySeasonDesc(String country);
    // List<GoldMedal> getByCountryOrderByCityAsc(String country);
    // List<GoldMedal> getByCountryOrderByCityDesc(String country);
    // List<GoldMedal> getByCountryOrderByNameAsc(String country);
    // List<GoldMedal> getByCountryOrderByNameDesc(String country);
    // List<GoldMedal> getByCountryOrderByEventAsc(String country);
    // List<GoldMedal> getByCountryOrderByEventDesc(String country);
}
