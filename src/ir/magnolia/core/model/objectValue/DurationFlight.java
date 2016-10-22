package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Ticks",
        "Days",
        "Hours",
        "Milliseconds",
        "Minutes",
        "Seconds",
        "TotalDays",
        "TotalHours",
        "TotalMilliseconds",
        "TotalMinutes",
        "TotalSeconds"
})
public class DurationFlight {

    @JsonProperty("Ticks")
    private Long ticks;
    @JsonProperty("Days")
    private Integer days;
    @JsonProperty("Hours")
    private Integer hours;
    @JsonProperty("Milliseconds")
    private Integer milliseconds;
    @JsonProperty("Minutes")
    private Integer minutes;
    @JsonProperty("Seconds")
    private Integer seconds;
    @JsonProperty("TotalDays")
    private Double totalDays;
    @JsonProperty("TotalHours")
    private Double totalHours;
    @JsonProperty("TotalMilliseconds")
    private Integer totalMilliseconds;
    @JsonProperty("TotalMinutes")
    private Integer totalMinutes;
    @JsonProperty("TotalSeconds")
    private Integer totalSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The ticks
     */
    @JsonProperty("Ticks")
    public Long getTicks() {
        return ticks;
    }

    /**
     * @param ticks The Ticks
     */
    @JsonProperty("Ticks")
    public void setTicks(Long ticks) {
        this.ticks = ticks;
    }

    public DurationFlight withTicks(Long ticks) {
        this.ticks = ticks;
        return this;
    }

    /**
     * @return The days
     */
    @JsonProperty("Days")
    public Integer getDays() {
        return days;
    }

    /**
     * @param days The Days
     */
    @JsonProperty("Days")
    public void setDays(Integer days) {
        this.days = days;
    }

    public DurationFlight withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * @return The hours
     */
    @JsonProperty("Hours")
    public Integer getHours() {
        return hours;
    }

    /**
     * @param hours The Hours
     */
    @JsonProperty("Hours")
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public DurationFlight withHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    /**
     * @return The milliseconds
     */
    @JsonProperty("Milliseconds")
    public Integer getMilliseconds() {
        return milliseconds;
    }

    /**
     * @param milliseconds The Milliseconds
     */
    @JsonProperty("Milliseconds")
    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public DurationFlight withMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
        return this;
    }

    /**
     * @return The minutes
     */
    @JsonProperty("Minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * @param minutes The Minutes
     */
    @JsonProperty("Minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public DurationFlight withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * @return The seconds
     */
    @JsonProperty("Seconds")
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * @param seconds The Seconds
     */
    @JsonProperty("Seconds")
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public DurationFlight withSeconds(Integer seconds) {
        this.seconds = seconds;
        return this;
    }

    /**
     * @return The totalDays
     */
    @JsonProperty("TotalDays")
    public Double getTotalDays() {
        return totalDays;
    }

    /**
     * @param totalDays The TotalDays
     */
    @JsonProperty("TotalDays")
    public void setTotalDays(Double totalDays) {
        this.totalDays = totalDays;
    }

    public DurationFlight withTotalDays(Double totalDays) {
        this.totalDays = totalDays;
        return this;
    }

    /**
     * @return The totalHours
     */
    @JsonProperty("TotalHours")
    public Double getTotalHours() {
        return totalHours;
    }

    /**
     * @param totalHours The TotalHours
     */
    @JsonProperty("TotalHours")
    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }

    public DurationFlight withTotalHours(Double totalHours) {
        this.totalHours = totalHours;
        return this;
    }

    /**
     * @return The totalMilliseconds
     */
    @JsonProperty("TotalMilliseconds")
    public Integer getTotalMilliseconds() {
        return totalMilliseconds;
    }

    /**
     * @param totalMilliseconds The TotalMilliseconds
     */
    @JsonProperty("TotalMilliseconds")
    public void setTotalMilliseconds(Integer totalMilliseconds) {
        this.totalMilliseconds = totalMilliseconds;
    }

    public DurationFlight withTotalMilliseconds(Integer totalMilliseconds) {
        this.totalMilliseconds = totalMilliseconds;
        return this;
    }

    /**
     * @return The totalMinutes
     */
    @JsonProperty("TotalMinutes")
    public Integer getTotalMinutes() {
        return totalMinutes;
    }

    /**
     * @param totalMinutes The TotalMinutes
     */
    @JsonProperty("TotalMinutes")
    public void setTotalMinutes(Integer totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public DurationFlight withTotalMinutes(Integer totalMinutes) {
        this.totalMinutes = totalMinutes;
        return this;
    }

    /**
     * @return The totalSeconds
     */
    @JsonProperty("TotalSeconds")
    public Integer getTotalSeconds() {
        return totalSeconds;
    }

    /**
     * @param totalSeconds The TotalSeconds
     */
    @JsonProperty("TotalSeconds")
    public void setTotalSeconds(Integer totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public DurationFlight withTotalSeconds(Integer totalSeconds) {
        this.totalSeconds = totalSeconds;
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

    public DurationFlight withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
