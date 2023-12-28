package baguchan.earthmobsmod.api;

public interface IMuddyPig {
	boolean isMuddy();

	void setMuddy(boolean playing);

	float getBodyRollAngle(float p_30433_, float p_30434_);

	default boolean canMuddy() {
		return true;
	}

	void setColorData(byte colorData);

	byte getColorData();
}