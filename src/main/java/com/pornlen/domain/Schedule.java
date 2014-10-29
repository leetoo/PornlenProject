package com.pornlen.domain;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * The persistent class for the schedule database table.
 */
@Entity
@Table(name = "schedule")
public class Schedule extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    @Column(length = 255)
    private String carrier;

    @Column(length = 255)
    private String carrierDescription;

    private float density;

    private byte distributionFinished;

    @Column(length = 255)
    private String forwarder;

    @Column(length = 255)
    private String forwarderDescription;

    private int kilograms;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date lastModifiedDate;

    private int liters;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loadingDate;

    private BigInteger orderNumber;

    @Column(length = 255)
    private String pool;

    @Column(length = 255)
    private String pourCardNumber;

    @Column(length = 255)
    private String propane;

    @Column(length = 255)
    private String region;

    private int reservationNumber;

    private int routeNumber;

    @Column(length = 255)
    private String tdsNumber;

    private float temperature;

    @Temporal(TemporalType.TIMESTAMP)
    private Date unloadingDate;

    private int weightAfter;

    @Column(length = 255)
    private String weightAmountNumber;

    private int weightBefore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver")
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fuelType")
    private FuelType fuelType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station")
    private Station station;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terminal")
    private Terminal unloadTerminal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terminal")
    private Terminal loadTerminal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck")
    private Vehicle truck;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck")
    private Vehicle semiTrailer;

    public Schedule() {
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrierDescription() {
        return this.carrierDescription;
    }

    public void setCarrierDescription(String carrierDescription) {
        this.carrierDescription = carrierDescription;
    }

    public float getDensity() {
        return this.density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public byte getDistributionFinished() {
        return this.distributionFinished;
    }

    public void setDistributionFinished(byte distributionFinished) {
        this.distributionFinished = distributionFinished;
    }

    public String getForwarder() {
        return this.forwarder;
    }

    public void setForwarder(String forwarder) {
        this.forwarder = forwarder;
    }

    public String getForwarderDescription() {
        return this.forwarderDescription;
    }

    public void setForwarderDescription(String forwarderDescription) {
        this.forwarderDescription = forwarderDescription;
    }

    public int getKilograms() {
        return this.kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getLiters() {
        return this.liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public Date getLoadingDate() {
        return this.loadingDate;
    }

    public void setLoadingDate(Date loadingDate) {
        this.loadingDate = loadingDate;
    }

    public BigInteger getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(BigInteger orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getPourCardNumber() {
        return this.pourCardNumber;
    }

    public void setPourCardNumber(String pourCardNumber) {
        this.pourCardNumber = pourCardNumber;
    }

    public String getPropane() {
        return this.propane;
    }

    public void setPropane(String propane) {
        this.propane = propane;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getReservationNumber() {
        return this.reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public int getRouteNumber() {
        return this.routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getTdsNumber() {
        return this.tdsNumber;
    }

    public void setTdsNumber(String tdsNumber) {
        this.tdsNumber = tdsNumber;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Date getUnloadingDate() {
        return this.unloadingDate;
    }

    public void setUnloadingDate(Date unloadingDate) {
        this.unloadingDate = unloadingDate;
    }

    public int getWeightAfter() {
        return this.weightAfter;
    }

    public void setWeightAfter(int weightAfter) {
        this.weightAfter = weightAfter;
    }

    public String getWeightAmountNumber() {
        return this.weightAmountNumber;
    }

    public void setWeightAmountNumber(String weightAmountNumber) {
        this.weightAmountNumber = weightAmountNumber;
    }

    public int getWeightBefore() {
        return this.weightBefore;
    }

    public void setWeightBefore(int weightBefore) {
        this.weightBefore = weightBefore;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Terminal getUnloadTerminal() {
        return unloadTerminal;
    }

    public void setUnloadTerminal(Terminal unloadTerminal) {
        this.unloadTerminal = unloadTerminal;
    }

    public Terminal getLoadTerminal() {
        return loadTerminal;
    }

    public void setLoadTerminal(Terminal loadTerminal) {
        this.loadTerminal = loadTerminal;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getTruck() {
        return truck;
    }

    public void setTruck(Vehicle truck) {
        this.truck = truck;
    }

    public Vehicle getSemiTrailer() {
        return semiTrailer;
    }

    public void setSemiTrailer(Vehicle semiTrailer) {
        this.semiTrailer = semiTrailer;
    }
}