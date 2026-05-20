package controllers;

import models.Brand;

public class BrandController {
    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
        int bajo = 0;
        int alto = brands.length - 1;
        sortBubbleDesc(brands);

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = brands[centro].getTotalValidYears();
            if (valorCentro == validYears) {
                return brands[centro];
            }
            if (valorCentro > validYears) {
                if (isAscending) {
                    alto = centro - 1;
                } else {
                    bajo = centro + 1;
                }
            } else {
                if (isAscending) {
                    bajo = centro + 1;
                } else {
                    alto = centro - 1;
                }
            }

        }
        return null;

    }

    public Brand[] sortBubbleDesc(Brand[] brands) {

        boolean x;
        for (int i = 0; i < brands.length - 1; i++) {
            x = false;

            for (int j = 0; j < brands.length - 1 - i; j++) {

                if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
                    Brand aux = brands[j];
                    brands[j] = brands[j + 1];
                    brands[j + 1] = aux;
                    x = true;

                }
            }
            if (!x) {
                break;
            }
        }
        return brands;
    }


}
