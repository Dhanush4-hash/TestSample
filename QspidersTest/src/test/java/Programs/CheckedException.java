package Programs;

 class CheckedException {

	static void submit() throws OfferException {
		int money = 4000;
		if (money >= 6000) {
			System.out.println("offer is applicable");

		} else {

		//	throw new OfferException("offer is not applicable");

		}
	}

	public static void main(String[] args) {

		try {
			submit();
		} catch (OfferException e) {

			e.getmsg();

		}

	}

	class OfferException extends Exception {
		String msg;
		public OfferException(String string) {
			this.msg = msg;
		}

		public String getmsg() {
			return msg;

		}

	}

}