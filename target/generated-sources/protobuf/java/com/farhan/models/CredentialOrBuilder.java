// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package com.farhan.models;

public interface CredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credential)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Email emailMode = 1;</code>
   */
  boolean hasEmailMode();
  /**
   * <code>.Email emailMode = 1;</code>
   */
  com.farhan.models.Email getEmailMode();
  /**
   * <code>.Email emailMode = 1;</code>
   */
  com.farhan.models.EmailOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  boolean hasPhoneOTPMode();
  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  com.farhan.models.PhoneOTP getPhoneOTPMode();
  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  com.farhan.models.PhoneOTPOrBuilder getPhoneOTPModeOrBuilder();

  public com.farhan.models.Credential.ModeCase getModeCase();
}
