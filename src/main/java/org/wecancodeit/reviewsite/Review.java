package org.wecancodeit.reviewsite;

import org.wecancodeit.reviewsite.Review;

public class Review {
	String[] tags;					// Array used for storing tags
	Long id;						// ID number for the web page instance of the president
	String presName;				// Name of the president - aka Title
	String category;				// Categories will be Presidents and Geneva Convention
	String content;					// Content string
	String tagString;				// Variable used to convert tags into strings
	String image;				// String for accessing image for page
	String termYears;				// Years in office
	String crimes;					// Ways in which this president violated the Geneva Conventions - description variable
	String wikiURL;					// Wikipedia page for president
	String crimeOneURL;				// Wikipedia page for the president's first violation of the Geneva convention
	String crimeTwoURL;				// Wikipedia page for the president's second violation of the Geneva convention
	String crimeThreeURL;			// Wikipedia page for the president's third violation of the Geneva convention
	
	// Constructor used for testing
	public Review(Long id, String presName, String category, String content, String imageURL) {
		this.id = id;
		this.presName = presName;
		this.category = category;
		this.content = content;
		this.image = imageURL;
		this.termYears = content.substring(0, 11);
		this.crimes = content.substring(12);
		this.wikiURL = "";
		this.crimeOneURL = "";
		this.crimeTwoURL = "";
		this.crimeThreeURL = "";
	}
	
	// Constructor for instances used in the actual project, and also wow this is a long constructor
	public Review(Long id, String presName, String category, String content, String imageURL, String wikiURL, String crimeOneURL, String crimeTwoURL, String crimeThreeURL, String[] tags) {
		this.id = id;
		this.presName = presName;
		this.category = category;
		this.content = content;
		this.image = imageURL;
		this.termYears = content.substring(0, 11);
		this.crimes = content.substring(12);
		this.wikiURL = wikiURL;
		this.crimeOneURL = crimeOneURL;
		this.crimeTwoURL = crimeTwoURL;
		this.crimeThreeURL = crimeThreeURL;
		this.tags = tags;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Review other = (Review) obj;
		if (this.id.equals(other.getId())) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getCrimeOneURL() {
		return crimeOneURL;
	}
	
	public String getCrimeTwoURL() {
		return crimeTwoURL;
	}
	
	public String getCrimeThreeURL() {
		return crimeThreeURL;
	}
	
	public String getCrimes() {
		return crimes;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getImageURL() {
		return image;
	}
	
	public String getPresName() {
		return presName;
	}
	
	public String getTagString() {
		return tagString;
	}
	
	public String getTermYears() {
		return termYears;
	}
	
	public String getWikiURL() {
		return wikiURL;
	}
	
	public String tagToString() {
		String tagString = "";
		for(int i = 0; i < (tags.length - 1); i++) {
			tagString += tags[i] + ", ";
		}
		tagString += tags[tags.length - 1];
		return tagString;
	}
}

	