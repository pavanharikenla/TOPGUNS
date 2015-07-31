package com.vz.tg.model;

public class HomeBean {
	private long resultCount;
	private long positiveCount;
	private long negativeCount;
	private long neutralCount;

	public long getPositiveCount() {
		return positiveCount;
	}

	public void setPositiveCount(long positiveCount) {
		this.positiveCount = positiveCount;
	}

	public long getNegativeCount() {
		return negativeCount;
	}

	public void setNegativeCount(long negativeCount) {
		this.negativeCount = negativeCount;
	}

	public long getNeutralCount() {
		return neutralCount;
	}

	public void setNeutralCount(long neutralCount) {
		this.neutralCount = neutralCount;
	}

	public long getResultCount() {
		return resultCount;
	}

	public void setResultCount(long resultCount) {
		this.resultCount = resultCount;
	}
}
