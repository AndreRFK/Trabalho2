/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.trabalho2;

public class Country {

    private String name;
    private String capital;
    private double extension;
    private Country[] Border;
    private int length;

    public Country(String name, String capital, double extension) {
        this.name = name;
        this.capital = capital;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public Country[] getBorder() {
        return this.Border;
    }

    public boolean equals(Country outro) {
        return this.name.equals(outro.getName()) && this.capital.equals(outro.getCapital());
    }

    public void setBorder(Country... countrys) {

        int numberOfCountriesEqual = 0;
        for (int i = 0; i < countrys.length; i++) {
            if (this.equals(countrys[i])) {
                numberOfCountriesEqual++;
            }
        }
        this.Border = new Country[countrys.length - numberOfCountriesEqual];
        int idxBorder = 0;
        for (int i = 0; i < countrys.length; i++) {
            if (!this.equals(countrys[i])) {
                this.Border[idxBorder] = countrys[i];
                idxBorder++;
            }
        }

    }

    public Country[] neighborsCountriesInCoumum(Country outro) {
        int EqualTotals = 0;
        for (Country borderCountry : this.Border) {
            for (Country borderOutro : outro.Border) {
                if (borderCountry.equals(borderOutro)) {
                    EqualTotals++;
                }
            }
        }

        if (EqualTotals > 0) {
            int idxNeighbors = 0;
            Country[] sameNeighbors = new Country[EqualTotals];
            for (Country borderCountry : this.Border) {
                for (Country borderOutro : outro.Border) {
                    if (borderCountry.equals(borderOutro)) {
                        sameNeighbors[idxNeighbors] = borderOutro;
                        idxNeighbors++;
                    }
                }
            }

            return sameNeighbors;
        }

        return null;
    }
}
