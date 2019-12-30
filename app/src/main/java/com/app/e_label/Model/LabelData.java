package com.app.e_label.Model;


import com.google.gson.annotations.SerializedName;

public class LabelData {
    @SerializedName("id")
    private String id;
    @SerializedName("id2")
    private String id2;
    @SerializedName("name")
    private String name;
    @SerializedName("jenis")
    private String jenis;
    @SerializedName("jenis_sepcific")
    private String jenis_specific;
    @SerializedName("description")
    private String description;
    @SerializedName("org_id")
    private String org_id;
    @SerializedName("organization_name")
    private String organization_name;
    @SerializedName("business_criticity")
    private String business_criticity;
    @SerializedName("move2production")
    private String move2production;
    @SerializedName("serialnumber")
    private String serialnumber;
    @SerializedName("location_id")
    private String location_id;
    @SerializedName("location_name")
    private String location_name;
    @SerializedName("status")
    private String status;
    @SerializedName("brand_id")
    private String brand_id;
    @SerializedName("model_id")
    private String model_id;
    @SerializedName("brand_name")
    private String brand_name;
    @SerializedName("model_name")
    private String model_name;
    @SerializedName("asset_number")
    private String asset_number;
    @SerializedName("purchase_date")
    private String purchase_date;
    @SerializedName("end_of_warranty")
    private String end_of_warranty;
    @SerializedName("finalclass")
    private String finalclass;
    @SerializedName("friendlyname")
    private String friendlyname;
    @SerializedName("obsolescence_flag")
    private String obsolescence_flag;
    @SerializedName("obsolescence_date")
    private String obsolescence_date;
    @SerializedName("org_id_friendlyname")
    private String org_id_friendlyname;
    @SerializedName("org_id_obsolescence_flag")
    private String org_id_obsolescence_flag;
    @SerializedName("location_id_friendlyname")
    private String location_id_friendlyname;
    @SerializedName("location_id_obsolescence")
    private String location_id_obsolescence_flag;
    @SerializedName("brand_id_friendlyname")
    private String brand_id_friendlyname;
    @SerializedName("model_id_friendlyname")
    private String model_id_friendlyname;

    public LabelData(String id, String id2, String name, String jenis, String jenis_specific, String description, String org_id, String organization_name, String business_criticity, String move2production, String serialnumber, String location_id,
                     String location_name, String status, String brand_id, String brand_name, String model_id, String model_name, String asset_number, String purchase_date, String end_of_warranty, String finalclass, String friendlyname, String obsolescence_flag, String obsolescence_date, String org_id_friendlyname, String org_id_obsolescence_flag, String location_id_friendlyname, String location_id_obsolescence_flag, String brand_id_friendlyname, String model_id_friendlyname) {
        this.id = id;
        this.id2 = id2;
        this.name = name;
        this.jenis = jenis;
        this.jenis_specific = jenis_specific;
        this.description = description;
        this.org_id = org_id;
        this.organization_name = organization_name;
        this.business_criticity = business_criticity;
        this.move2production = move2production;
        this.serialnumber = serialnumber;
        this.location_id = location_id;
        this.location_name = location_name;
        this.status = status;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.model_id = model_id;
        this.model_name = model_name;
        this.asset_number = asset_number;
        this.purchase_date = purchase_date;
        this.end_of_warranty = end_of_warranty;
        this.finalclass = finalclass;
        this.friendlyname = friendlyname;
        this.obsolescence_flag = obsolescence_flag;
        this.obsolescence_date = obsolescence_date;
        this.org_id_friendlyname = org_id_friendlyname;
        this.org_id_obsolescence_flag = org_id_obsolescence_flag;
        this.location_id_friendlyname = location_id_friendlyname;
        this.location_id_obsolescence_flag = location_id_obsolescence_flag;
        this.brand_id_friendlyname = brand_id_friendlyname;
        this.model_id_friendlyname = model_id_friendlyname;
    }


    public String getId(){
        return id;
    }

    public String getId2(){
        return id2;
    }

    public String getName(){
        return name;
    }

    public String getJenis(){
        return jenis;
    }

    public String getJenisSpecific(){
        return jenis_specific;
    }

    public String getDescription() {
        return description;
    }

    public String getOrgId(){
        return org_id;
    }

    public String getOrganizationName(){
        return organization_name;
    }

    public String getMove2Production(){
        return move2production;
    }

    public String getBusinessCriticity(){
        return 	business_criticity;
    }

    public String getSerialNumber(){
        return serialnumber;
    }

    public String getLocationId(){
        return location_id;
    }

    public String getLocationName(){
        return location_name;
    }

    public String getStatus(){
        return status;
    }

    public String getBrandId(){
        return brand_id;
    }

    public String getBrandName(){
        return brand_name;
    }

    public String getModelId(){
        return model_id;
    }

    public String getModelName(){
        return model_name;
    }

    public String getAssetNumber(){
        return asset_number;
    }

    public String getPurchaseDate(){
        return purchase_date;
    }

    public String getEndofWarranty(){
        return end_of_warranty;
    }

    public String getFinalClass(){
        return finalclass;
    }

    public String getFriendlyName(){
        return friendlyname;
    }

    public String getObsolescenceFlag(){
        return obsolescence_flag;
    }

    public String getObsolescenceDate(){
        return obsolescence_date;
    }

    public String getOrgIdFriendlyName(){
        return org_id_friendlyname;
    }

    public String getOrgIdObsolescenceFlag(){
        return org_id_obsolescence_flag;
    }

    public String getLocationIdFriendlyName(){
        return location_id_friendlyname;
    }

    public String getLocationIdObsolescenceFlag(){
        return location_id_obsolescence_flag;
    }

    public String getBrandIdFriendlyName(){
        return brand_id_friendlyname;
    }

    public String getModelIdFriendlyName(){
        return model_id_friendlyname;
    }


}


