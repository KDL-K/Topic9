package com.shevlik.Topic9;

import java.util.ArrayList;
import java.util.Scanner;

public class NewCarList implements VehicleList {
    private ArrayList<CarNew> carList=new ArrayList<CarNew>();

    public NewCarList(){}
    public NewCarList(CarNew... carList){
        setCarList(carList);
    }

    public ArrayList<CarNew> getCarList() {
        return carList;
    }

    public void setCarList(CarNew[] carList) {
        int sizeCarList=carList.length;
        for (int i=0;i<sizeCarList;i++){
            this.carList.add(carList[i]);
        }
    }
    public void showCarList(){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            System.out.println(carList.get(i).toString());
        }
    }

    public void addToCarList(CarNew carNew){
        this.carList.add(carNew);
    }

    public void addToCarList(){
        Scanner in=new Scanner(System.in);
        System.out.println("Addition of the new car in the database:");
        System.out.print("Brand: ");
        String brandStr=in.nextLine();
        System.out.print("Model: ");
        String model=in.nextLine();
        System.out.print("Engine type: ");
        String engineStr=in.nextLine();
        System.out.print("Transmission: ");
        String transmissionStr=in.nextLine();
        System.out.print("Colour: ");
        String colourStr=in.nextLine();
        System.out.print("Body type: ");
        String bodyTypeStr=in.nextLine();
        System.out.print("Price: ");
        long price=in.nextLong();
        CarNew carNew=new CarNew(brandStr, model, engineStr, transmissionStr, colourStr, bodyTypeStr, price);
        carList.add(carNew);
    }
    public void showCarByBrand(String brand){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getBrand().getName().equalsIgnoreCase(brand)){
                System.out.println(carList.get(i).toString());
            }
        }
    }
    public void showCarByEngine(String engine){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getEngine().getName().equalsIgnoreCase(engine)){
                System.out.println(carList.get(i).toString());
            }
        }
    }
    public void showCarByTransmission(String transmission){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getTransmission().getName().equalsIgnoreCase(transmission)){
                System.out.println(carList.get(i).toString());
            }
        }
    }

    public void showCarById(int id){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getId()==id){
                System.out.println(carList.get(i).toString());
                break;
            }
        }
    }

    public void deleteCarById(int id){
        int sizeCarList=carList.size();
        for(int i=0;i<sizeCarList;i++){
            if(carList.get(i).getId()==id){
                carList.remove(carList.get(i));
                System.out.println("Car "+id+" has been deleted");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "NewCarList{" +
                "carList=" + carList +
                '}';
    }
}
