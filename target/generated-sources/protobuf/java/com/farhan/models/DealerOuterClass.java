// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dealer.proto

package com.farhan.models;

public final class DealerOuterClass {
  private DealerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dealer_ModelEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dealer_ModelEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014dealer.proto\032\020common/car.proto\"f\n\006Deal" +
      "er\022!\n\005model\030\001 \003(\0132\022.Dealer.ModelEntry\0329\n" +
      "\nModelEntry\022\013\n\003key\030\001 \001(\005\022\032\n\005value\030\002 \001(\0132" +
      "\013.common.Car:\0028\001B\025\n\021com.farhan.modelsP\001b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.farhan.models.CarOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Dealer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Dealer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_descriptor,
        new java.lang.String[] { "Model", });
    internal_static_Dealer_ModelEntry_descriptor =
      internal_static_Dealer_descriptor.getNestedTypes().get(0);
    internal_static_Dealer_ModelEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dealer_ModelEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.farhan.models.CarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
