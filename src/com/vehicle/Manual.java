class Manual extends Transmission {
    private float FifthGearRatio;
    private float SixthGearRatio;

    public Manual(String ModelNo, String TransmissionType) {
        super(ModelNo, TransmissionType);
        if (ModelNo.equals("MP5")) {
            setFifthGearRatio(0.757f);

        } else if (ModelNo.equals("MP6")) {
            setFifthGearRatio(0.710f);
            setSixthGearRatio(0.570f);
        } else if (ModelNo.equals("MD5")) {
            setFifthGearRatio(0.725f);

        } else if (ModelNo.equals("MD6")) {
            setFifthGearRatio(0.750f);
            setSixthGearRatio(0.630f);


        }
    }

    public float getFifthGearRatio() {
        return FifthGearRatio;
    }

    public void setFifthGearRatio(float fifthGearRatio) {
        FifthGearRatio = fifthGearRatio;
    }

    public float getSixthGearRatio() {
        return SixthGearRatio;
    }

    public void setSixthGearRatio(float sixthGearRatio) {
        SixthGearRatio = sixthGearRatio;
    }

    public void showSpecification() {
        super.showSpecification();
        System.out.println("5th Gear Ratio--" + getFifthGearRatio() + "\n6th Gear Ratio--" + getSixthGearRatio());
    }
}

