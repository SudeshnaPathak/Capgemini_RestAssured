package FrameworkDemo.pojos;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProductPojo {
	private Integer productId;
    private String name;
    private String title;
    private String description;
    private Double rating;
    private Double price;
    private Double offer;
    private String type;
    private String brand;
    private String category;
    private Integer merchantId;
    private Integer quantity;
    private String status;
    private String thumbnailURL;
    private List<String> productImageURLs;
    private List<String> searchTags;
    private List<ReviewPojo> reviews;
    private LocalDateTime createdDateTime;
    private String zoneId;
    
    public ProductPojo() {}
    
    
	public ProductPojo(Integer productId, String name, String title, String description, Double rating, Double price,
			Double offer, String type, String brand, String category, Integer merchantId, Integer quantity,
			String status, String thumbnailURL, List<String> productImageURLs, List<String> searchTags,
			List<ReviewPojo> reviews, LocalDateTime createdDateTime, String zoneId) {
		super();
		this.productId = productId;
		this.name = name;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.offer = offer;
		this.type = type;
		this.brand = brand;
		this.category = category;
		this.merchantId = merchantId;
		this.quantity = quantity;
		this.status = status;
		this.thumbnailURL = thumbnailURL;
		this.productImageURLs = productImageURLs;
		this.searchTags = searchTags;
		this.reviews = reviews;
		this.createdDateTime = createdDateTime;
		this.zoneId = zoneId;
	}


	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getOffer() {
		return offer;
	}
	public void setOffer(Double offer) {
		this.offer = offer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getThumbnailURL() {
		return thumbnailURL;
	}
	public void setThumbnailURL(String thumbnailURL) {
		this.thumbnailURL = thumbnailURL;
	}
	public List<String> getProductImageURLs() {
		return productImageURLs;
	}
	public void setProductImageURLs(List<String> productImageURLs) {
		this.productImageURLs = productImageURLs;
	}
	public List<String> getSearchTags() {
		return searchTags;
	}
	public void setSearchTags(List<String> searchTags) {
		this.searchTags = searchTags;
	}
	public List<ReviewPojo> getReviews() {
		return reviews;
	}
	public void setReviews(List<ReviewPojo> reviews) {
		this.reviews = reviews;
	}
	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
    
    
}
