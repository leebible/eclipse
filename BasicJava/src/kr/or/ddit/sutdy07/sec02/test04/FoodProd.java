package kr.or.ddit.sutdy07.sec02.test04;

public class FoodProd extends Prod {

		private String expiration;

		public String getExpiration() {
			return expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		@Override
		public String toString() {
			return "FoodProd [유통기한=" + getExpiration() + "]";
		}

	
}
