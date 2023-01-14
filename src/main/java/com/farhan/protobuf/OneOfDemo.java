package com.farhan.protobuf;

import com.farhan.models.Credential;
import com.farhan.models.Email;
import com.farhan.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {
        Email emailCredential = Email.newBuilder()
                .setUsername("farhan")
                .setPassword(123123)
                .build();

        PhoneOTP phoneOTPCredential = PhoneOTP.newBuilder()
                .setNumber(123123132)
                .setCode(2334)
                .build();

        Credential userCredential = Credential.newBuilder()
                .setEmailMode(emailCredential)
//                .setPhoneOTPMode(phoneOTPCredential)
                .build();

        login(userCredential);
    }

    private static void login(Credential credential){

        switch (credential.getModeCase())
        {
            case EMAILMODE:
                System.out.println(credential.getEmailMode());
                break;
            case PHONEOTPMODE:
                System.out.println(credential.getPhoneOTPMode());
                break;
        }
    }


}
