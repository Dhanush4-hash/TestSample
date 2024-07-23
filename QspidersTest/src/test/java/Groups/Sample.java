package Groups;

import org.testng.annotations.Test;

public class Sample {

	@Test(groups = { "Smoke" })
	public void verifyGroups() {

		System.out.println("test ng ");
	}

	@Test(groups = { "Smoke" })
	public void verifyGroups1() {

		System.out.println("test ng 1");
	}

	@Test(groups = { "sanity", "Smoke" })
	public void verifyGroups2() {

		System.out.println("test ng 2");
	}

	@Test(groups = { "sanity" })
	public void verifyGroups3() {

		System.out.println("test ng 3");
	}

	@Test(groups = { "Regression" })
	public void verifyGroups4() {

		System.out.println("test ng 4");
	}

}