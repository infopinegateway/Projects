package com.spring.ioc.bean;

import com.spring.ioc.service.Encyclopedia;
import com.spring.ioc.service.Oracle;

public class BookwormOracle implements Oracle {
	  private Encyclopedia encyclopedia;

	  public String defineMeaningOfLife() {
	    Long ageOfUniverse = this.encyclopedia.findLong("AgeOfUniverse");
	    Long constantOfLife = this.encyclopedia.findLong("ConstantOfLife");
	    return String.valueOf(ageOfUniverse / constantOfLife);
	  }

	  public void setEncyclopedia(Encyclopedia encyclopedia) {
	    this.encyclopedia = encyclopedia;
	  }

}
