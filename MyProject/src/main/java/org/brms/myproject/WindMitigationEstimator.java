package org.brms.myproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WindMitigationEstimator implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer yearBuilt;
   private java.lang.String county;
   private java.lang.Integer roofYear;

   public WindMitigationEstimator()
   {
   }

   public java.lang.Integer getYearBuilt()
   {
      return this.yearBuilt;
   }

   public void setYearBuilt(java.lang.Integer yearBuilt)
   {
      this.yearBuilt = yearBuilt;
   }

   public java.lang.String getCounty()
   {
      return this.county;
   }

   public void setCounty(java.lang.String county)
   {
      this.county = county;
   }

   public java.lang.Integer getRoofYear()
   {
      return this.roofYear;
   }

   public void setRoofYear(java.lang.Integer roofYear)
   {
      this.roofYear = roofYear;
   }

   public WindMitigationEstimator(java.lang.Integer yearBuilt,
         java.lang.String county, java.lang.Integer roofYear)
   {
      this.yearBuilt = yearBuilt;
      this.county = county;
      this.roofYear = roofYear;
   }

}