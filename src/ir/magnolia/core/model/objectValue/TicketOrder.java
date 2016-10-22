package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RT",
        "PersionNameRequier",
        "TicketID",
        "AirlineChar",
        "Baggeg",
        "SourceCityChar",
        "DestinationCityChar",
        "Count",
        "FlightNumber",
        "AirLineCode",
        "CraftInfo",
        "TicketPrice",
        "InfantPrice",
        "ChildPrice",
        "TaxFee",
        "DiscountPrecent",
        "FlighDate",
        "DurationFlight",
        "FlighTime",
        "EndFlighDate",
        "FareRull"
})
public class TicketOrder {

    @JsonProperty("RT")
    private Integer rT;
    @JsonProperty("PersionNameRequier")
    private Boolean persionNameRequier;
    @JsonProperty("TicketID")
    private Integer ticketID;
    @JsonProperty("AirlineChar")
    private String airlineChar;
    @JsonProperty("Baggeg")
    private Integer baggeg;
    @JsonProperty("SourceCityChar")
    private String sourceCityChar;
    @JsonProperty("DestinationCityChar")
    private String destinationCityChar;
    @JsonProperty("Count")
    private Integer count;
    @JsonProperty("FlightNumber")
    private String flightNumber;
    @JsonProperty("AirLineCode")
    private String airLineCode;
    @JsonProperty("CraftInfo")
    private String craftInfo;
    @JsonProperty("TicketPrice")
    private Integer ticketPrice;
    @JsonProperty("InfantPrice")
    private String infantPrice;
    @JsonProperty("ChildPrice")
    private Integer childPrice;
    @JsonProperty("TaxFee")
    private String taxFee;
    @JsonProperty("DiscountPrecent")
    private Integer discountPrecent;
    @JsonProperty("FlighDate")
    private String flighDate;
    @JsonProperty("DurationFlight")
    private DurationFlight durationFlight;
    @JsonProperty("FlighTime")
    private String flighTime;
    @JsonProperty("EndFlighDate")
    private String endFlighDate;
    @JsonProperty("FareRull")
    private String fareRull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The rT
     */
    @JsonProperty("RT")
    public Integer getRT() {
        return rT;
    }

    /**
     * @param rT The RT
     */
    @JsonProperty("RT")
    public void setRT(Integer rT) {
        this.rT = rT;
    }

    public TicketOrder withRT(Integer rT) {
        this.rT = rT;
        return this;
    }

    /**
     * @return The persionNameRequier
     */
    @JsonProperty("PersionNameRequier")
    public Boolean getPersionNameRequier() {
        return persionNameRequier;
    }

    /**
     * @param persionNameRequier The PersionNameRequier
     */
    @JsonProperty("PersionNameRequier")
    public void setPersionNameRequier(Boolean persionNameRequier) {
        this.persionNameRequier = persionNameRequier;
    }

    public TicketOrder withPersionNameRequier(Boolean persionNameRequier) {
        this.persionNameRequier = persionNameRequier;
        return this;
    }

    /**
     * @return The ticketID
     */
    @JsonProperty("TicketID")
    public Integer getTicketID() {
        return ticketID;
    }

    /**
     * @param ticketID The TicketID
     */
    @JsonProperty("TicketID")
    public void setTicketID(Integer ticketID) {
        this.ticketID = ticketID;
    }

    public TicketOrder withTicketID(Integer ticketID) {
        this.ticketID = ticketID;
        return this;
    }

    /**
     * @return The airlineChar
     */
    @JsonProperty("AirlineChar")
    public String getAirlineChar() {
        return airlineChar;
    }

    /**
     * @param airlineChar The AirlineChar
     */
    @JsonProperty("AirlineChar")
    public void setAirlineChar(String airlineChar) {
        this.airlineChar = airlineChar;
    }

    public TicketOrder withAirlineChar(String airlineChar) {
        this.airlineChar = airlineChar;
        return this;
    }

    /**
     * @return The baggeg
     */
    @JsonProperty("Baggeg")
    public Integer getBaggeg() {
        return baggeg;
    }

    /**
     * @param baggeg The Baggeg
     */
    @JsonProperty("Baggeg")
    public void setBaggeg(Integer baggeg) {
        this.baggeg = baggeg;
    }

    public TicketOrder withBaggeg(Integer baggeg) {
        this.baggeg = baggeg;
        return this;
    }

    /**
     * @return The sourceCityChar
     */
    @JsonProperty("SourceCityChar")
    public String getSourceCityChar() {
        return sourceCityChar;
    }

    /**
     * @param sourceCityChar The SourceCityChar
     */
    @JsonProperty("SourceCityChar")
    public void setSourceCityChar(String sourceCityChar) {
        this.sourceCityChar = sourceCityChar;
    }

    public TicketOrder withSourceCityChar(String sourceCityChar) {
        this.sourceCityChar = sourceCityChar;
        return this;
    }

    /**
     * @return The destinationCityChar
     */
    @JsonProperty("DestinationCityChar")
    public String getDestinationCityChar() {
        return destinationCityChar;
    }

    /**
     * @param destinationCityChar The DestinationCityChar
     */
    @JsonProperty("DestinationCityChar")
    public void setDestinationCityChar(String destinationCityChar) {
        this.destinationCityChar = destinationCityChar;
    }

    public TicketOrder withDestinationCityChar(String destinationCityChar) {
        this.destinationCityChar = destinationCityChar;
        return this;
    }

    /**
     * @return The count
     */
    @JsonProperty("Count")
    public Integer getCount() {
        return count;
    }

    /**
     * @param count The Count
     */
    @JsonProperty("Count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public TicketOrder withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * @return The flightNumber
     */
    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber The FlightNumber
     */
    @JsonProperty("FlightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public TicketOrder withFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    /**
     * @return The airLineCode
     */
    @JsonProperty("AirLineCode")
    public String getAirLineCode() {
        return airLineCode;
    }

    /**
     * @param airLineCode The AirLineCode
     */
    @JsonProperty("AirLineCode")
    public void setAirLineCode(String airLineCode) {
        this.airLineCode = airLineCode;
    }

    public TicketOrder withAirLineCode(String airLineCode) {
        this.airLineCode = airLineCode;
        return this;
    }

    /**
     * @return The craftInfo
     */
    @JsonProperty("CraftInfo")
    public String getCraftInfo() {
        return craftInfo;
    }

    /**
     * @param craftInfo The CraftInfo
     */
    @JsonProperty("CraftInfo")
    public void setCraftInfo(String craftInfo) {
        this.craftInfo = craftInfo;
    }

    public TicketOrder withCraftInfo(String craftInfo) {
        this.craftInfo = craftInfo;
        return this;
    }

    /**
     * @return The ticketPrice
     */
    @JsonProperty("TicketPrice")
    public Integer getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice The TicketPrice
     */
    @JsonProperty("TicketPrice")
    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public TicketOrder withTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }

    /**
     * @return The infantPrice
     */
    @JsonProperty("InfantPrice")
    public String getInfantPrice() {
        return infantPrice;
    }

    /**
     * @param infantPrice The InfantPrice
     */
    @JsonProperty("InfantPrice")
    public void setInfantPrice(String infantPrice) {
        this.infantPrice = infantPrice;
    }

    public TicketOrder withInfantPrice(String infantPrice) {
        this.infantPrice = infantPrice;
        return this;
    }

    /**
     * @return The childPrice
     */
    @JsonProperty("ChildPrice")
    public Integer getChildPrice() {
        return childPrice;
    }

    /**
     * @param childPrice The ChildPrice
     */
    @JsonProperty("ChildPrice")
    public void setChildPrice(Integer childPrice) {
        this.childPrice = childPrice;
    }

    public TicketOrder withChildPrice(Integer childPrice) {
        this.childPrice = childPrice;
        return this;
    }

    /**
     * @return The taxFee
     */
    @JsonProperty("TaxFee")
    public String getTaxFee() {
        return taxFee;
    }

    /**
     * @param taxFee The TaxFee
     */
    @JsonProperty("TaxFee")
    public void setTaxFee(String taxFee) {
        this.taxFee = taxFee;
    }

    public TicketOrder withTaxFee(String taxFee) {
        this.taxFee = taxFee;
        return this;
    }

    /**
     * @return The discountPrecent
     */
    @JsonProperty("DiscountPrecent")
    public Integer getDiscountPrecent() {
        return discountPrecent;
    }

    /**
     * @param discountPrecent The DiscountPrecent
     */
    @JsonProperty("DiscountPrecent")
    public void setDiscountPrecent(Integer discountPrecent) {
        this.discountPrecent = discountPrecent;
    }

    public TicketOrder withDiscountPrecent(Integer discountPrecent) {
        this.discountPrecent = discountPrecent;
        return this;
    }

    /**
     * @return The flighDate
     */
    @JsonProperty("FlighDate")
    public String getFlighDate() {
        return flighDate;
    }

    /**
     * @param flighDate The FlighDate
     */
    @JsonProperty("FlighDate")
    public void setFlighDate(String flighDate) {
        this.flighDate = flighDate;
    }

    public TicketOrder withFlighDate(String flighDate) {
        this.flighDate = flighDate;
        return this;
    }

    /**
     * @return The durationFlight
     */
    @JsonProperty("DurationFlight")
    public DurationFlight getDurationFlight() {
        return durationFlight;
    }

    /**
     * @param durationFlight The DurationFlight
     */
    @JsonProperty("DurationFlight")
    public void setDurationFlight(DurationFlight durationFlight) {
        this.durationFlight = durationFlight;
    }

    public TicketOrder withDurationFlight(DurationFlight durationFlight) {
        this.durationFlight = durationFlight;
        return this;
    }

    /**
     * @return The flighTime
     */
    @JsonProperty("FlighTime")
    public String getFlighTime() {
        return flighTime;
    }

    /**
     * @param flighTime The FlighTime
     */
    @JsonProperty("FlighTime")
    public void setFlighTime(String flighTime) {
        this.flighTime = flighTime;
    }

    public TicketOrder withFlighTime(String flighTime) {
        this.flighTime = flighTime;
        return this;
    }

    /**
     * @return The endFlighDate
     */
    @JsonProperty("EndFlighDate")
    public String getEndFlighDate() {
        return endFlighDate;
    }

    /**
     * @param endFlighDate The EndFlighDate
     */
    @JsonProperty("EndFlighDate")
    public void setEndFlighDate(String endFlighDate) {
        this.endFlighDate = endFlighDate;
    }

    public TicketOrder withEndFlighDate(String endFlighDate) {
        this.endFlighDate = endFlighDate;
        return this;
    }

    /**
     * @return The fareRull
     */
    @JsonProperty("FareRull")
    public String getFareRull() {
        return fareRull;
    }

    /**
     * @param fareRull The FareRull
     */
    @JsonProperty("FareRull")
    public void setFareRull(String fareRull) {
        this.fareRull = fareRull;
    }

    public TicketOrder withFareRull(String fareRull) {
        this.fareRull = fareRull;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TicketOrder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
