/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Calculate;

//import java.io.File;

import com.MasterData.Tarif;
import com.MasterData.TarifDao;
import com.MasterData.IndexPaket;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;

/**
 *
 * @author user
 */
public class DaoDaftarHargaPengirimanPaket {
private Tarif paketTarif;
    private double berat;
    
    /**
     * @return the paketTarif
     */
   public DaoDaftarHargaPengirimanPaket(){
       
   }
   public double hitunganHargaKirimPaketRegulerNonAsuransi(int inx){
       double regNonAsuransi =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       regNonAsuransi =  indPaket.getReguler()*getBerat();
       return regNonAsuransi;
   }
   public double hitunganHargaKirimPaketKilatNonAsuransi(int inx){
       double kilatNonAsuransi =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       kilatNonAsuransi =  indPaket.getKilat()*getBerat();
       return kilatNonAsuransi;
   }
   public double hitunganHargaKirimPaketSDSNonAsuransi(int inx){
       double SDSNonAsuransi =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       SDSNonAsuransi =  indPaket.getSameDayService()*getBerat();
       return SDSNonAsuransi;
   }
   public double hitunganHargaKirimPaketOnsNonAsuransi(int inx){
       double OnsNonAsuransi =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       OnsNonAsuransi =  indPaket.getOneDayService()*getBerat();
       return OnsNonAsuransi;
   }
   public double hitunganHargaKirimPaketHdsNonAsuransi(int inx){
       double hdsNonAsuransi =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       hdsNonAsuransi =  indPaket.getHourDayService()*getBerat();
       return hdsNonAsuransi;
   }
   
   public double hitunganHargaKirimPaketRegulerDgnAsuransi(int inx){
       double biayaAsuransi =hitunganHargaKirimPaketRegulerDgnAsuransi(inx)*0.003;
       double RegulerAsuransi = hitunganHargaKirimPaketRegulerDgnAsuransi(inx)+biayaAsuransi;
      return RegulerAsuransi;
   }
   public double hitungHargaKirimPaketKilatDgnAsuransi (int inx){
       double biayaAsuransi = hitungHargaKirimPaketKilatDgnAsuransi(inx)*0.003;
       double KilatAsuransi = hitungHargaKirimPaketKilatDgnAsuransi(inx)+biayaAsuransi;
       return KilatAsuransi;
   }
   public double hitungHargaKirimPaketSDSDgnAsuransi (int inx){
       double biayaAsuransi = hitungHargaKirimPaketSDSDgnAsuransi(inx)*0.003;
       double SDSAsuransi = hitungHargaKirimPaketSDSDgnAsuransi(inx)+biayaAsuransi;
       return SDSAsuransi;
   }
   public double  hitungHargaKirimPaketONSDgnAsuransi (int inx){
       double biayaAsuransi = hitungHargaKirimPaketONSDgnAsuransi(inx)*0.003;
       double ONSAsuransi = hitungHargaKirimPaketONSDgnAsuransi(inx)+biayaAsuransi;
       return ONSAsuransi;
   }
   public double hitungHargaKirimPaketHDSDgnAsuransi (int inx){
       double biayaAsuransi = hitungHargaKirimPaketHDSDgnAsuransi (inx)*0.003;
       double HDSAsuransi = hitungHargaKirimPaketHDSDgnAsuransi(inx)+biayaAsuransi;
       return HDSAsuransi;
   }
   public Tarif getPaketTarif() {
        return paketTarif;
    }

    /**
     * @param paketTarif the paketTarif to set
     */
    public void setPaketTarif(Tarif paketTarif) {
        this.paketTarif = paketTarif;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String hitungHargaKirimPaketHDSDgnAsuransi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setPaketTarif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
////private boolean dataExisting;
////private String daftarHargaPengirimanPaket;
////private int index;
////private ArrayList<String> listPerItem;
////    private ArrayList<String>listType;
////    private String itemCity;
////    private String itemCostReguler;
////    private String itemCostKilat;
////    private String itemCostSds;
////    private String itemCostOns;
////    private String itemCostHds;
////    private String costBerdasarkanJenisKiriman;
////public DaoDaftarHargaPengirimanPaket(int index){
////    this.index=index;
////}
////    
////public DaoDaftarHargaPengirimanPaket(){
////    
////}
////    public void readAllListPengirimanPaket(){
////        listPerItem = new ArrayList<>();
////        listType = new ArrayList<>();
////        try{
////            dataExisting = true;
////            Scanner sc = new Scanner(new File("C:/Java/listHarga.txt"));
////            while(sc.hasNextLine()){
////                daftarHargaPengirimanPaket=sc.nextLine();
////                listPerItem.add(daftarHargaPengirimanPaket);
////                String [] splitter = daftarHargaPengirimanPaket.split(",");
////                listType.add(splitter[1]+","+splitter[2]+","+splitter[3]+","+splitter[4]+","+splitter[5]);
////            
////        }
////    }catch (FileNotFoundException e){
////        dataExisting=false;
////    }
////    }
////    public boolean lookExistingDatabase(){
////        readAllListPengirimanPaket();
////        return dataExisting;
////    
////    }
////    public String allList(){
////        readAllListPengirimanPaket();
////        return daftarHargaPengirimanPaket;
////}
////    
////    public void getOneListItem(){
////        readAllListPengirimanPaket();
////        String item = listPerItem.get(this.index);
////        String[] splitter = item.split(",");
////        itemCity=splitter[0];
////        String cost = listType.get(this.index);
////        String [] splitter = cost.split(",");
////    }
////    /**
////     * @return the dataExisting
////     */
////    public boolean isDataExisting() {
////        return dataExisting;
////    }
////
////    /**
////     * @param dataExisting the dataExisting to set
////     */
////    public void setDataExisting(boolean dataExisting) {
////        this.dataExisting = dataExisting;
////    }
////
////    /**
////     * @return the daftarHargaPengirimanPaket
////     */
////    public String getDaftarHargaPengirimanPaket() {
////        return daftarHargaPengirimanPaket;
////    }
////
////    /**
////     * @param daftarHargaPengirimanPaket the daftarHargaPengirimanPaket to set
////     */
////    public void setDaftarHargaPengirimanPaket(String daftarHargaPengirimanPaket) {
////        this.daftarHargaPengirimanPaket = daftarHargaPengirimanPaket;
////    }
////
////    /**
////     * @return the index
////     */
////    public int getIndex() {
////        return index;
////    }
////
////    /**
////     * @param index the index to set
////     */
////    public void setIndex(int index) {
////        this.index = index;
////    }
////
////    /**
////     * @return the listPerItem
////     */
////    public ArrayList<String> getListPerItem() {
////        return listPerItem;
////    }
////
////    /**
////     * @param listPerItem the listPerItem to set
////     */
////    public void setListPerItem(ArrayList<String> listPerItem) {
////        this.listPerItem = listPerItem;
////    }
////
////    /**
////     * @return the listType
////     */
////    public ArrayList<String> getListType() {
////        return listType;
////    }
////
////    /**
////     * @param listType the listType to set
////     */
////    public void setListType(ArrayList<String> listType) {
////        this.listType = listType;
////    }
////
////    /**
////     * @return the itemCity
////     */
////    public String getItemCity() {
////        return itemCity;
////    }
////
////    /**
////     * @param itemCity the itemCity to set
////     */
////    public void setItemCity(String itemCity) {
////        this.itemCity = itemCity;
////    }
////
////    /**
////     * @return the itemCostReguler
////     */
////    public String getItemCostReguler() {
////        return itemCostReguler;
////    }
////
////    /**
////     * @param itemCostReguler the itemCostReguler to set
////     */
////    public void setItemCostReguler(String itemCostReguler) {
////        this.itemCostReguler = itemCostReguler;
////    }
////
////    /**
////     * @return the itemCostKilat
////     */
////    public String getItemCostKilat() {
////        return itemCostKilat;
////    }
////
////    /**
////     * @param itemCostKilat the itemCostKilat to set
////     */
////    public void setItemCostKilat(String itemCostKilat) {
////        this.itemCostKilat = itemCostKilat;
////    }
////
////    /**
////     * @return the itemCostSds
////     */
////    public String getItemCostSds() {
////        return itemCostSds;
////    }
////
////    /**
////     * @param itemCostSds the itemCostSds to set
////     */
////    public void setItemCostSds(String itemCostSds) {
////        this.itemCostSds = itemCostSds;
////    }
////
////    /**
////     * @return the itemCostOns
////     */
////    public String getItemCostOns() {
////        return itemCostOns;
////    }
////
////    /**
////     * @param itemCostOns the itemCostOns to set
////     */
////    public void setItemCostOns(String itemCostOns) {
////        this.itemCostOns = itemCostOns;
////    }
////
////    /**
////     * @return the itemCostHds
////     */
////    public String getItemCostHds() {
////        return itemCostHds;
////    }
////
////    /**
////     * @param itemCostHds the itemCostHds to set
////     */
////    public void setItemCostHds(String itemCostHds) {
////        this.itemCostHds = itemCostHds;
////    }
////
////    /**
////     * @return the costBerdasarkanJenisKiriman
////     */
////    public String getCostBerdasarkanJenisKiriman() {
////        return costBerdasarkanJenisKiriman;
////    }
////
////    /**
////     * @param costBerdasarkanJenisKiriman the costBerdasarkanJenisKiriman to set
////     */
////    public void setCostBerdasarkanJenisKiriman(String costBerdasarkanJenisKiriman) {
////        this.costBerdasarkanJenisKiriman = costBerdasarkanJenisKiriman;
////    }
////
////    
////}
