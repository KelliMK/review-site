package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviewsite.Review;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();
	
	public ReviewRepository() {
		String[] tagsGeneva = {"Human Rights", "International Law", "Things Presidents Hate"};
		addReview(new Review(0L, "Geneva Conventions", "International Law", "Since 1945 The Geneva Conventions have extensively defined the basic rights of wartime prisoners (civilians and military personnel), established protections for the wounded and sick, and established protections for the civilians in and around a war-zone.", "imageURL", "Geneva_Conventions", "Geneva_Conventions#History", "Geneva_Conventions#Common_Article_2_relating_to_international_armed_conflicts", "Geneva_Conventions#Enforcement", tagsGeneva));
		
		String[] tags34 = {"President", "tag two", "tag three"};
		addReview(new Review(34L, "Dwight D. Eisenhower", "President of USA", "1953 - 1961 Overthrew Conservative Nationalist Government of Iran with a military coup, which led to 25 years of dictatorship. Overthrew the first (and still the last) democratic government of Guatemala with a military coup. Conducted major terrorist operations in Indonesia (on Indonesian citizens) to loosen their control on outer Indonesian islands and curb the \"threat\" of Indonesian democracy", "/images/Eisenhower.jpg", "Dwight_D._Eisenhower", "Dwight_D._Eisenhower", "Dwight_D._Eisenhower", "Dwight_D._Eisenhower", tags34));
		
		String[] tags35 = {"President", "tag two", "tag three"};
		addReview(new Review(35L, "John F. Kennedy", "President of USA", "1961 - 1963 Authorized the use of Napalm and other chemical weapons for the first time outside of a war, on South Vietnamize citizens. Destroyed food, crops, and farming land with chemical weapons, resulting in unusable land in South Vietnam. Put Vietnamese civilians in concentration camps as a military show of force", "/images/Kennedy.jpg", "John_F._Kennedy", "John_F._Kennedy", "John_F._Kennedy", "John_F._Kennedy", tags35));
		
		String[] tags36 = {"President", "tag two", "tag three"};
		addReview(new Review(36L, "Lyndon B. Johnson", "President of USA", "1963 - 1969 Expanded war in Indo-China leading to the death of over 3 million people. Invaded the Dominican Republic to quell Democratic revolution and keep dictator Francois Duvalier in power. Supported (aka funded) Israeli occupation of Palestine and military suppression of Palestinians who would not leave their homes", "/images/Johnson.jpg", "Lyndon_B._Johnson", "Lyndon_B._Johnson", "Lyndon_B._Johnson", "Lyndon_B._Johnson", tags36));
		
		String[] tags37 = {"President", "tag two", "tag three"};
		addReview(new Review(37L, "Richard Nixon", "President of USA", "1969 - 1974 Bombing of Cambodia (at the Recommendation of Henry Kissinger). Colluded with milk producers to drive up prices. Embezzlement.", "/images/Nixon.jpg", "Richard_Nixon", "Richard_Nixon", "Richard_Nixon", "Richard_Nixon", tags37));
		
		String[] tags38 = {"President", "tag two", "tag three"};
		addReview(new Review(38L, "Gerald Ford", "President of USA", "1974 - 1977  Endorsed the Indonesian invasion of East Timor, which is a fancy way to say that he endorsed genocide. Daniel Moynihan (U.S. representive at the U.N. during Ford's presidency) famously admitted that his orders from the president at the time were to render the U.N. ineffective in taking any action regarding the genocide (sorry, \"conflict\") in East Timor.", "/images/Ford.jpg", "Gerald_Ford", "Gerald_Ford", "Gerald_Ford", "Gerald_Ford", tags38));
		
		String[] tags39 = {"President", "tag two", "tag three"};
		addReview(new Review(39L, "Jimmy Carter", "President of USA", "1977 - 1981 Carter in fact increased the flow of weapons to Indonesia to aid the invasion of East Timor. Considered the Camp David Agreements a diplomatic disaster, because it required recognizing Palestinians as Human Beings. Directed more than 50% America's foreign aid worldwide at Israel exclusively for Military spending", "/images/Carter.jpg", "Jimmy_Carter", "Jimmy_Carter", "Jimmy_Carter", "Jimmy_Carter", tags39));
		
		String[] tags40 = {"President", "Neoliberal", "tag three"};
		addReview(new Review(40L, "Ronald Reagan", "President of USA", "1981 - 1989 First U.S. President to be condemned by the International Court of Justice, the principal Judicial Organ of the United Nations, for the use of force in Nicaragua that the U.N. classified as \"invasive terrorism\"", "/images/Reagan.jpg", "Ronald_Reagan", "Ronald_Reagan", "Ronald_Reagan", "Ronald_Reagan", tags40));
		
		String[] tags41 = {"President", "tag two", "tag three"};
		addReview(new Review(41L, "George H.W. Bush", "President of USA", "1989 - 1993 Invasion of Panama. Went to war with Iraq, and did \"strategic\" attacks on civilian infrastructure, electricity, water, and housing (to redirect Iranian military efforts to helping their own citizens rebuild their homes).", "/images/BushSR.jpg", "George_H._W._Bush", "George_H._W._Bush", "George_H._W._Bush", "George_H._W._Bush", tags41));
		
		String[] tags42 = {"President", "Neoliberal", "tag three"};
		addReview(new Review(42L, "Bill Clinton", "President of USA", "1993 - 2001 Used 2 cruise missiles to bomb a pharmacutical plant in Sudan. Conservative estimates place the civilian casualties above 10,000 people. There was no intelligence failure, Clinton knew what he was bombing. Declared all past U.N. resolutions \"obsolete\" and \"anachronistic\", effectively declaring International Law pointless.", "/images/Clinton.jpg", "Bill_Clinton", "Bill_Clinton", "Bill_Clinton", "Bill_Clinton", tags42));
		
		String[] tags43 = {"President", "Hates New Orleans", "War For Profit"};
		addReview(new Review(43L, "George W. Bush", "President of USA", "2001 - 2009 Invasion of Iraq. Authorized torture and striking due process for potential war opponents (aka POWs). Let New Orleans drown.", "/images/BushJR.jpeg", "George_W._Bush", "George_W._Bush", "George_W._Bush", "George_W._Bush", tags43));
		
		String[] tags44 = {"President", "Neoliberal", "Forgave Banks of Stealing"};
		addReview(new Review(44L, "Barack Obama", "President of USA", "2009 - 2017 Pioneered drone strikes on foreign nations. This led to bombing a Doctor's Without Borders hospital in Afghanistan, and 26,171 bombs being dropped by drones in 2016. These bombs were spread between Iraq, Syria, Pakistan, Afghanistan, Libya, Yemen, and Somalia. The U.S. was not at war with any of these countries excluding Afghanistan. ", "/images/Obama.jpg", "Barack_Obama", "Barack_Obama", "Barack_Obama", "Barack_Obama", tags44));
		
		String[] tags45 = {"President", "White Supremacist", "Fascist"};
		addReview(new Review(45L, "Donald Trump", "President of USA", "2017 - fuck Do I really have to go through the Bombing of Syria, the barring of refugees, and the detaining of immigrants to convince you that Donald Trump is fucking vile?", "/images/Trump.jpg", "Donald_Trump", "Donald_Trump", "Donald_Trump", "Donald_Trump", tags45));
	}
	
	public Collection<Review> getAllReviews() {
		return reviews.values();
	}

	public void addReview(Review review) {
		reviews.put(review.getID(), review);
	}

	public Review getReview(long id) {
		return reviews.get(id);
	}
}
