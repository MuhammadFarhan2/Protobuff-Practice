// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package com.farhan.models;

/**
 * Protobuf type {@code Credential}
 */
public  final class Credential extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Credential)
    CredentialOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Credential.newBuilder() to construct.
  private Credential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credential() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Credential(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.farhan.models.Email.Builder subBuilder = null;
            if (modeCase_ == 1) {
              subBuilder = ((com.farhan.models.Email) mode_).toBuilder();
            }
            mode_ =
                input.readMessage(com.farhan.models.Email.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.farhan.models.Email) mode_);
              mode_ = subBuilder.buildPartial();
            }
            modeCase_ = 1;
            break;
          }
          case 18: {
            com.farhan.models.PhoneOTP.Builder subBuilder = null;
            if (modeCase_ == 2) {
              subBuilder = ((com.farhan.models.PhoneOTP) mode_).toBuilder();
            }
            mode_ =
                input.readMessage(com.farhan.models.PhoneOTP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.farhan.models.PhoneOTP) mode_);
              mode_ = subBuilder.buildPartial();
            }
            modeCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.farhan.models.Credentials.internal_static_Credential_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.farhan.models.Credentials.internal_static_Credential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.farhan.models.Credential.class, com.farhan.models.Credential.Builder.class);
  }

  private int modeCase_ = 0;
  private java.lang.Object mode_;
  public enum ModeCase
      implements com.google.protobuf.Internal.EnumLite {
    EMAILMODE(1),
    PHONEOTPMODE(2),
    MODE_NOT_SET(0);
    private final int value;
    private ModeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModeCase forNumber(int value) {
      switch (value) {
        case 1: return EMAILMODE;
        case 2: return PHONEOTPMODE;
        case 0: return MODE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ModeCase
  getModeCase() {
    return ModeCase.forNumber(
        modeCase_);
  }

  public static final int EMAILMODE_FIELD_NUMBER = 1;
  /**
   * <code>.Email emailMode = 1;</code>
   */
  public boolean hasEmailMode() {
    return modeCase_ == 1;
  }
  /**
   * <code>.Email emailMode = 1;</code>
   */
  public com.farhan.models.Email getEmailMode() {
    if (modeCase_ == 1) {
       return (com.farhan.models.Email) mode_;
    }
    return com.farhan.models.Email.getDefaultInstance();
  }
  /**
   * <code>.Email emailMode = 1;</code>
   */
  public com.farhan.models.EmailOrBuilder getEmailModeOrBuilder() {
    if (modeCase_ == 1) {
       return (com.farhan.models.Email) mode_;
    }
    return com.farhan.models.Email.getDefaultInstance();
  }

  public static final int PHONEOTPMODE_FIELD_NUMBER = 2;
  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  public boolean hasPhoneOTPMode() {
    return modeCase_ == 2;
  }
  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  public com.farhan.models.PhoneOTP getPhoneOTPMode() {
    if (modeCase_ == 2) {
       return (com.farhan.models.PhoneOTP) mode_;
    }
    return com.farhan.models.PhoneOTP.getDefaultInstance();
  }
  /**
   * <code>.PhoneOTP phoneOTPMode = 2;</code>
   */
  public com.farhan.models.PhoneOTPOrBuilder getPhoneOTPModeOrBuilder() {
    if (modeCase_ == 2) {
       return (com.farhan.models.PhoneOTP) mode_;
    }
    return com.farhan.models.PhoneOTP.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (modeCase_ == 1) {
      output.writeMessage(1, (com.farhan.models.Email) mode_);
    }
    if (modeCase_ == 2) {
      output.writeMessage(2, (com.farhan.models.PhoneOTP) mode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.farhan.models.Email) mode_);
    }
    if (modeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.farhan.models.PhoneOTP) mode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.farhan.models.Credential)) {
      return super.equals(obj);
    }
    com.farhan.models.Credential other = (com.farhan.models.Credential) obj;

    boolean result = true;
    result = result && getModeCase().equals(
        other.getModeCase());
    if (!result) return false;
    switch (modeCase_) {
      case 1:
        result = result && getEmailMode()
            .equals(other.getEmailMode());
        break;
      case 2:
        result = result && getPhoneOTPMode()
            .equals(other.getPhoneOTPMode());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (modeCase_) {
      case 1:
        hash = (37 * hash) + EMAILMODE_FIELD_NUMBER;
        hash = (53 * hash) + getEmailMode().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PHONEOTPMODE_FIELD_NUMBER;
        hash = (53 * hash) + getPhoneOTPMode().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.farhan.models.Credential parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.farhan.models.Credential parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.farhan.models.Credential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.farhan.models.Credential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.farhan.models.Credential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.farhan.models.Credential parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.farhan.models.Credential parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.farhan.models.Credential parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.farhan.models.Credential parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.farhan.models.Credential parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.farhan.models.Credential parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.farhan.models.Credential parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.farhan.models.Credential prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Credential}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Credential)
      com.farhan.models.CredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.farhan.models.Credentials.internal_static_Credential_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.farhan.models.Credentials.internal_static_Credential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.farhan.models.Credential.class, com.farhan.models.Credential.Builder.class);
    }

    // Construct using com.farhan.models.Credential.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      modeCase_ = 0;
      mode_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.farhan.models.Credentials.internal_static_Credential_descriptor;
    }

    @java.lang.Override
    public com.farhan.models.Credential getDefaultInstanceForType() {
      return com.farhan.models.Credential.getDefaultInstance();
    }

    @java.lang.Override
    public com.farhan.models.Credential build() {
      com.farhan.models.Credential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.farhan.models.Credential buildPartial() {
      com.farhan.models.Credential result = new com.farhan.models.Credential(this);
      if (modeCase_ == 1) {
        if (emailModeBuilder_ == null) {
          result.mode_ = mode_;
        } else {
          result.mode_ = emailModeBuilder_.build();
        }
      }
      if (modeCase_ == 2) {
        if (phoneOTPModeBuilder_ == null) {
          result.mode_ = mode_;
        } else {
          result.mode_ = phoneOTPModeBuilder_.build();
        }
      }
      result.modeCase_ = modeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.farhan.models.Credential) {
        return mergeFrom((com.farhan.models.Credential)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.farhan.models.Credential other) {
      if (other == com.farhan.models.Credential.getDefaultInstance()) return this;
      switch (other.getModeCase()) {
        case EMAILMODE: {
          mergeEmailMode(other.getEmailMode());
          break;
        }
        case PHONEOTPMODE: {
          mergePhoneOTPMode(other.getPhoneOTPMode());
          break;
        }
        case MODE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.farhan.models.Credential parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.farhan.models.Credential) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int modeCase_ = 0;
    private java.lang.Object mode_;
    public ModeCase
        getModeCase() {
      return ModeCase.forNumber(
          modeCase_);
    }

    public Builder clearMode() {
      modeCase_ = 0;
      mode_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.farhan.models.Email, com.farhan.models.Email.Builder, com.farhan.models.EmailOrBuilder> emailModeBuilder_;
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public boolean hasEmailMode() {
      return modeCase_ == 1;
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public com.farhan.models.Email getEmailMode() {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1) {
          return (com.farhan.models.Email) mode_;
        }
        return com.farhan.models.Email.getDefaultInstance();
      } else {
        if (modeCase_ == 1) {
          return emailModeBuilder_.getMessage();
        }
        return com.farhan.models.Email.getDefaultInstance();
      }
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public Builder setEmailMode(com.farhan.models.Email value) {
      if (emailModeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        emailModeBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public Builder setEmailMode(
        com.farhan.models.Email.Builder builderForValue) {
      if (emailModeBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        emailModeBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public Builder mergeEmailMode(com.farhan.models.Email value) {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1 &&
            mode_ != com.farhan.models.Email.getDefaultInstance()) {
          mode_ = com.farhan.models.Email.newBuilder((com.farhan.models.Email) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 1) {
          emailModeBuilder_.mergeFrom(value);
        }
        emailModeBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public Builder clearEmailMode() {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
        }
        emailModeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public com.farhan.models.Email.Builder getEmailModeBuilder() {
      return getEmailModeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    public com.farhan.models.EmailOrBuilder getEmailModeOrBuilder() {
      if ((modeCase_ == 1) && (emailModeBuilder_ != null)) {
        return emailModeBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 1) {
          return (com.farhan.models.Email) mode_;
        }
        return com.farhan.models.Email.getDefaultInstance();
      }
    }
    /**
     * <code>.Email emailMode = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.farhan.models.Email, com.farhan.models.Email.Builder, com.farhan.models.EmailOrBuilder> 
        getEmailModeFieldBuilder() {
      if (emailModeBuilder_ == null) {
        if (!(modeCase_ == 1)) {
          mode_ = com.farhan.models.Email.getDefaultInstance();
        }
        emailModeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.farhan.models.Email, com.farhan.models.Email.Builder, com.farhan.models.EmailOrBuilder>(
                (com.farhan.models.Email) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 1;
      onChanged();;
      return emailModeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.farhan.models.PhoneOTP, com.farhan.models.PhoneOTP.Builder, com.farhan.models.PhoneOTPOrBuilder> phoneOTPModeBuilder_;
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public boolean hasPhoneOTPMode() {
      return modeCase_ == 2;
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public com.farhan.models.PhoneOTP getPhoneOTPMode() {
      if (phoneOTPModeBuilder_ == null) {
        if (modeCase_ == 2) {
          return (com.farhan.models.PhoneOTP) mode_;
        }
        return com.farhan.models.PhoneOTP.getDefaultInstance();
      } else {
        if (modeCase_ == 2) {
          return phoneOTPModeBuilder_.getMessage();
        }
        return com.farhan.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public Builder setPhoneOTPMode(com.farhan.models.PhoneOTP value) {
      if (phoneOTPModeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        phoneOTPModeBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public Builder setPhoneOTPMode(
        com.farhan.models.PhoneOTP.Builder builderForValue) {
      if (phoneOTPModeBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        phoneOTPModeBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public Builder mergePhoneOTPMode(com.farhan.models.PhoneOTP value) {
      if (phoneOTPModeBuilder_ == null) {
        if (modeCase_ == 2 &&
            mode_ != com.farhan.models.PhoneOTP.getDefaultInstance()) {
          mode_ = com.farhan.models.PhoneOTP.newBuilder((com.farhan.models.PhoneOTP) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 2) {
          phoneOTPModeBuilder_.mergeFrom(value);
        }
        phoneOTPModeBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public Builder clearPhoneOTPMode() {
      if (phoneOTPModeBuilder_ == null) {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
        }
        phoneOTPModeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public com.farhan.models.PhoneOTP.Builder getPhoneOTPModeBuilder() {
      return getPhoneOTPModeFieldBuilder().getBuilder();
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    public com.farhan.models.PhoneOTPOrBuilder getPhoneOTPModeOrBuilder() {
      if ((modeCase_ == 2) && (phoneOTPModeBuilder_ != null)) {
        return phoneOTPModeBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 2) {
          return (com.farhan.models.PhoneOTP) mode_;
        }
        return com.farhan.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.PhoneOTP phoneOTPMode = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.farhan.models.PhoneOTP, com.farhan.models.PhoneOTP.Builder, com.farhan.models.PhoneOTPOrBuilder> 
        getPhoneOTPModeFieldBuilder() {
      if (phoneOTPModeBuilder_ == null) {
        if (!(modeCase_ == 2)) {
          mode_ = com.farhan.models.PhoneOTP.getDefaultInstance();
        }
        phoneOTPModeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.farhan.models.PhoneOTP, com.farhan.models.PhoneOTP.Builder, com.farhan.models.PhoneOTPOrBuilder>(
                (com.farhan.models.PhoneOTP) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 2;
      onChanged();;
      return phoneOTPModeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Credential)
  }

  // @@protoc_insertion_point(class_scope:Credential)
  private static final com.farhan.models.Credential DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.farhan.models.Credential();
  }

  public static com.farhan.models.Credential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credential>
      PARSER = new com.google.protobuf.AbstractParser<Credential>() {
    @java.lang.Override
    public Credential parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Credential(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Credential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credential> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.farhan.models.Credential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

