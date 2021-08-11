package com.company.mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations {
    public USA usa;
    public Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }


    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country sendcountry, Country acceptCountry) {
        // 接收方为伊拉克
        if (sendcountry == usa && acceptCountry == iraq) {
            iraq.getMessage(message, sendcountry);
        } else {
            usa.getMessage(message, sendcountry);
        }
    }
}
