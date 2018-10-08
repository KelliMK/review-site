package org.wecancodeit.reviewsite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	@Test
	public void shouldGetCollection() {
		ReviewRepository underTest = new ReviewRepository();
		Collection<Review> result = underTest.getAllReviews();
		assertThat(result, hasItems(new Review(45L, "Donald Trump", "President of USA", "2017 - fuck Do I really have to go through the Bombing of Syria, the barring of refugees, and the detaining of immigrants to convince you that Donald Trump is fucking vile?", "/images/Trump.jpg"),
				new Review(37L, "Richard Nixon", "President of USA", "1969 - 1974 Bombing of Cambodia (at the Recommendation of Henry Kissinger). Colluded with milk producers to drive up prices. Embezzlement.", "/images/Nixon.jpg")));
	}

	@Test
	public void shouldGetReview() {
		ReviewRepository underTest = new ReviewRepository();
		Review result = underTest.getReview(0L);
		assertThat(result, is(equalTo(new Review(0L, "Geneva Conventions", "International Law", "Since 1945 The Geneva Conventions have extensively defined the basic rights of wartime prisoners (civilians and military personnel), established protections for the wounded and sick, and established protections for the civilians in and around a war-zone.", "imageURL"))));
	}

}
