package io.spring.api;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.spring.api.models.Region;
import io.spring.api.services.RegionService;

@SpringBootTest
class RegionTest {

	private RegionService regionService;

	@Autowired
	public RegionTest(RegionService regionService) {
		this.regionService = regionService;
	}

	@Test
	void insert() {
		// Arrange
		Region region = new Region();
		region.setName("WIW");

		// Act
		Boolean result = regionService.save(region);

		// Assert
		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void update() {
		// Arrange
		Region region = new Region();
		region.setId(7);
		region.setName("WAW");

		// Act
		Boolean result = regionService.save(region);

		// Assert
		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void delete() {
		// Arrange
		Integer id = 7;

		// Act
		Boolean result = regionService.delete(id);

		// Assert
		Assertions.assertThat(result).isEqualTo(true);
	}
}
