package com.app.e_label;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.app.e_label.Model.Post;
import com.app.qrcodescanner.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Menu extends AppCompatActivity {

    TextView textView, textView2, textViewId, textViewOrg, textViewBusiness, textViewLoc,
            textViewsStat, textViewBrandId, textViewBrandName, textViewModelName, textViewAssetNumber,
            textViewPurchaseDate, textViewFinalClass;

    private String dataTransfer= "";
    private final String urllink = "https://jsonplaceholder.typicode.com";
    private final String bppt1 = "http://10.11.5.220";
    private final String bppt = "http://192.168.43.39";

    private String id, name, organization_name, business_criticity, location_name, status, brand_id, brand_name, model_name, asset_number, purchase_date, finalclass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setLayoutView();
        Intent i = getIntent();
        String dataTransfer1 = i.getExtras().getString("a");
        //String url = "/api/pk/" + dataTransfer1;
        String url = urllink + "posts/" + dataTransfer1;
        setData(dataTransfer1);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(bppt)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

            JsonPlaceHolderApi request = retrofit.create(JsonPlaceHolderApi.class);
            Call<Post> call = request.getPosts(getData());

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if (!response.isSuccessful()){
                    textView.setText("Code:" + getData() + "\n" +response.code());
                    return;
                }
                    Post posts = response.body();

                    /**content += "Name: " + "\n";
                    content += "Brand Name:" + posts.getBrandName() + "\n";
                    content += "Model Name:" + posts.getModelName() + "\n";
                    content += "Asset Number:" + posts.getAssetNumber() + "\n";
                    content += "Location: " + posts.getLocationIdFriendlyname()+ "\n\n";

                    /**content += "userId: " + posts.getUserId() + "\n";
                    content += "id: " + posts.getId() + "\n";
                    content += "title:" + posts.getTitle() + "\n";
                    content += "body:" + posts.getText() + "\n";
                    textView.setText("Code2:" + getData());
                    textView.append(content); **/
                    setId(Integer.toString(posts.getId()));
                    setName(posts.getName());
                    setOrganization_name(posts.getOrganizationName());
                    setBusiness_criticity(posts.getBusinessCriticity());
                    setLocation_name(posts.getStatus());
                    setStatus(posts.getStatus());
                    setBrand_id(Integer.toString(posts.getBrandId()));
                    setBrand_name(posts.getBrandName());
                    setModel_name(posts.getModelName());
                    setAsset_number(posts.getAssetNumber());
                    setPurchase_date(posts.getPurchaseDate());
                    setFinalclass(posts.getFinalclass());
                    textView.setText(getName());
                    textViewId.setText(getId());
                    textViewOrg.setText(getOrganization_name());
                    textViewBusiness.setText(getBusiness_criticity());
                    textViewLoc.setText(getLocation_name());
                    textViewsStat.setText(getStatus());
                    textViewBrandId.setText(getBrand_id());
                    textViewBrandName.setText(getBrand_name());
                    textViewModelName.setText(getModel_name());
                    textViewAssetNumber.setText(getAsset_number());
                    textViewPurchaseDate.setText(getPurchase_date());
                    textViewFinalClass.setText(getFinalclass());

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }

    public void setData(String dataTransfer){
        this.dataTransfer = dataTransfer;
    }

    public String getData(){
        return dataTransfer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getBusiness_criticity() {
        return business_criticity;
    }

    public void setBusiness_criticity(String business_criticity) {
        this.business_criticity = business_criticity;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getAsset_number() {
        return asset_number;
    }

    public void setAsset_number(String asset_number) {
        this.asset_number = asset_number;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getFinalclass() {
        return finalclass;
    }

    public void setFinalclass(String finalclass) {
        this.finalclass = finalclass;
    }

    public void generateView(){
        textView2 = (TextView)findViewById(R.id.text);
        textView2.setText(getName());

    }

    public void setLayoutView(){
        textView = findViewById(R.id.name);
        textViewId = findViewById(R.id.id);
        textViewOrg = findViewById(R.id.organisasi);
        textViewBusiness = findViewById(R.id.business);
        textViewLoc = findViewById(R.id.loc);
        textViewsStat = findViewById(R.id.stat);
        textViewBrandId = findViewById(R.id.brandid);
        textViewBrandName = findViewById(R.id.brandname);
        textViewModelName = findViewById(R.id.modelname);
        textViewAssetNumber = findViewById(R.id.assetnumber);
        textViewPurchaseDate = findViewById(R.id.purchasedate);
        textViewFinalClass = findViewById(R.id.finalclass);
    }

}
