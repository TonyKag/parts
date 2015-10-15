package com.sqa.ao.properties.parts;

public class Part {
	private boolean isWaterProof;
	private double marketPrice;
	private int partId;
	private String partName;
	char partRating;

	public Part() {
		super();
		this.isWaterProof = isWaterProof;
		this.marketPrice = marketPrice;
		this.partId = partId;
		this.partName = partName;
		this.partRating = partRating;
	}

	public Part(boolean isWaterProof, double marketPrice, int partId, String partName, char partRating) {
		super();
		this.isWaterProof = isWaterProof;
		this.marketPrice = marketPrice;
		this.partId = partId;
		this.partName = partName;
		this.partRating = partRating;
	}

	/**
	 * @return the marketPrice
	 */
	public double getMarketPrice() {
		return marketPrice;
	}

	/**
	 * @return the partId
	 */
	public int getPartId() {
		return partId;
	}

	/**
	 * @return the partName
	 */
	public String getPartName() {
		return partName;
	}

	/**
	 * @return the partRating
	 */
	public char getPartRating() {
		return partRating;
	}

	/**
	 * @return the isWaterProof
	 */
	public boolean isWaterProof() {
		return isWaterProof;
	}

	/**
	 * @param marketPrice
	 *            the marketPrice to set
	 */
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	/**
	 * @param partId
	 *            the partId to set
	 */
	public void setPartId(int partId) {
		this.partId = partId;
	}

	/**
	 * @param partName
	 *            the partName to set
	 */
	public void setPartName(String partName) {
		this.partName = partName;
	}

	/**
	 * @param partRating
	 *            the partRating to set
	 */
	public void setPartRating(char partRating) {
		this.partRating = partRating;
	}

	/**
	 * @param isWaterProof
	 *            the isWaterProof to set
	 */
	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Part [isWaterProof=");
		builder.append(isWaterProof);
		builder.append(", marketPrice=");
		builder.append(marketPrice);
		builder.append(", partId=");
		builder.append(partId);
		builder.append(", partName=");
		builder.append(partName);
		builder.append(", partRating=");
		builder.append(partRating);
		builder.append("]");
		return builder.toString();
	}
}
