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
}
