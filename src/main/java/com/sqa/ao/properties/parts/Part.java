package com.sqa.ao.properties.parts;

import java.util.Properties;

import com.sqa.ao.utils.Helper;

public class Part {
	private boolean isWaterProof;
	private double marketPrice;
	private int partId;
	private String partName;
	char partRating;

	public Part() {
		Properties props = Helper.loadProperties("default-parts.config");
		this.setWaterProof(Boolean.parseBoolean(props.getProperty("isWaterproof")));
		this.setPartId(Integer.parseInt(props.getProperty("partId")));
		this.setPartName(props.getProperty("partName"));
		this.setMarketPrice(Double.parseDouble(props.getProperty("marketPrice")));
		this.setPartRating(props.getProperty("partRating").charAt(0));
	}

	public Part(boolean isWaterProof, double marketPrice, int partId, String partName, char partRating) {
		this.isWaterProof = isWaterProof;
		this.marketPrice = marketPrice;
		this.partId = partId;
		this.partName = partName;
		this.partRating = partRating;
		Properties props = new Properties();
		props.setProperty("isWaterProof", Boolean.toString(this.isWaterProof()));
		props.setProperty("marketPrice", Double.toHexString(this.getMarketPrice()));
		props.setProperty("partId", Integer.toString(this.getPartId()));
		props.setProperty("partName", this.getPartName());
		props.setProperty("partRating", Character.toString(this.getPartRating()));
		Helper.saveProperties("Saved-Properties", props);
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
