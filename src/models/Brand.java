package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] models;

  public Brand(String brandName, CarModel[] models) {
    this.brandName = brandName;
    this.models = models;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getModels() {
    return models;
  }

  public void setModels(CarModel[] models) {
    this.models = models;
  }

  public int getTotalValidYears() {
    int total = 0;
    for (CarModel m : models) {
      for (CarYear y : m.getYears()) {
        if (y.isValid()) {
          total++;
        }
      }
    }
    return total;

  }

  @Override
  public String toString() {
    return "Brand [brandName=" + brandName + ", models=" + Arrays.toString(models) + "]";
  }

}
