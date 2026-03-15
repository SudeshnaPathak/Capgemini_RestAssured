package FrameworkDemo.pojos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ReviewPojo {
	private Integer reviewId;
    private Integer shopperId;
    private String shopperName;
    private String heading;
    private String description;
    private Double rating;
    private LocalDateTime dateTime;
    
    public ReviewPojo() {}

	public ReviewPojo(Integer reviewId, Integer shopperId, String shopperName, String heading, String description,
			Double rating, LocalDateTime dateTime) {
		super();
		this.reviewId = reviewId;
		this.shopperId = shopperId;
		this.shopperName = shopperName;
		this.heading = heading;
		this.description = description;
		this.rating = rating;
		this.dateTime = dateTime;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getShopperId() {
		return shopperId;
	}

	public void setShopperId(Integer shopperId) {
		this.shopperId = shopperId;
	}

	public String getShopperName() {
		return shopperName;
	}

	public void setShopperName(String shopperName) {
		this.shopperName = shopperName;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
    
    
}
