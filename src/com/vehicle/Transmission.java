abstract public class Transmission {
    public String ModelNo;
    private String TransmissionType;
    private int ForwardGear;
    private float FirstGearRatio;
    private float SecondGearRatio;
    private float ThirdGearRatio;
    private float FourthGearRatio;

    public Transmission(String ModelNo, String TransmissionType) {
        this.ModelNo = ModelNo;
        this.TransmissionType = TransmissionType;
        if (ModelNo.equals("MP4")) {
            setForwardGear(4);
            setFirstGearRatio(2.540f);
            setSecondGearRatio(1.920f);
            setThirdGearRatio(1.510f);
            setFourthGearRatio(1.000f);

        } else if (ModelNo.equals("MP5")) {
            setForwardGear(5);
            setFirstGearRatio(3.545f);
            setSecondGearRatio(1.904f);
            setThirdGearRatio(1.280f);
            setFourthGearRatio(0.914f);

        } else if (ModelNo.equals("MP6")) {
            setForwardGear(6);
            setFirstGearRatio(3.010f);
            setSecondGearRatio(2.070f);
            setThirdGearRatio(1.430f);
            setFourthGearRatio(1.000f);

        } else if (ModelNo.equals("MD5")) {
            setForwardGear(5);
            setFirstGearRatio(3.545f);
            setSecondGearRatio(1.904f);
            setThirdGearRatio(1.233f);
            setFourthGearRatio(0.911f);

        } else if (ModelNo.equals("MD6")) {
            setForwardGear(6);
            setFirstGearRatio(3.640f);
            setSecondGearRatio(2.150f);
            setThirdGearRatio(1.360f);
            setFourthGearRatio(1.000f);

        } else if (ModelNo.equals("AMTP4")) {
            setForwardGear(4);
            setFirstGearRatio(2.540f);
            setSecondGearRatio(1.920f);
            setThirdGearRatio(1.510f);
            setFourthGearRatio(1.000f);
        } else if (ModelNo.equals("AMTP5")) {
            setForwardGear(5);
            setFirstGearRatio(2.950f);
            setSecondGearRatio(1.940f);
            setThirdGearRatio(1.340f);
            setFourthGearRatio(1.000f);

        } else if (ModelNo.equals("CVT6")) {
            setForwardGear(6);
            setFirstGearRatio(2.631f);
            setSecondGearRatio(1.440f);
            setThirdGearRatio(1.165f);
            setFourthGearRatio(0.906f);

        } else if (ModelNo.equals("DCT8")) {
            setForwardGear(8);
            setFirstGearRatio(4.714f);
            setSecondGearRatio(3.143f);
            setThirdGearRatio(2.106f);
            setFourthGearRatio(1.667f);

        }
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String modelNo) {
        ModelNo = modelNo;
    }

    public String getTransmissionType() {
        return TransmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        TransmissionType = transmissionType;
    }

    public int getForwardGear() {
        return ForwardGear;
    }

    public void setForwardGear(int forwardGear) {
        ForwardGear = forwardGear;
    }

    public float getFirstGearRatio() {
        return FirstGearRatio;
    }

    public void setFirstGearRatio(float firstGearRatio) {
        FirstGearRatio = firstGearRatio;
    }

    public float getSecondGearRatio() {
        return SecondGearRatio;
    }

    public void setSecondGearRatio(float secondGearRatio) {
        SecondGearRatio = secondGearRatio;
    }

    public float getThirdGearRatio() {
        return ThirdGearRatio;
    }

    public void setThirdGearRatio(float thirdGearRatio) {
        ThirdGearRatio = thirdGearRatio;
    }

    public float getFourthGearRatio() {
        return FourthGearRatio;
    }

    public void setFourthGearRatio(float fourthGearRatio) {
        FourthGearRatio = fourthGearRatio;
    }

    public void showSpecification() {
        System.out.println("Transmission type--" + getTransmissionType() + "\nModel no--" + getModelNo() + "\nforward Gear Ratio--" + getForwardGear() + "\n1st Gear Ratio-" + getFirstGearRatio() + "\n2nd Gear Ratio--" + getSecondGearRatio() + "\n3rd Gear Ratio--" + getThirdGearRatio() + "\n4th Gear ratio--" + getFourthGearRatio());
    }
}
