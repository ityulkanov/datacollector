/**
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Repeated.proto

package com.streamsets.pipeline.lib.util;

public final class RepeatedProto {
  private RepeatedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RepeatedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:util.Repeated)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 samples = 1;</code>
     */
    java.util.List<Integer> getSamplesList();
    /**
     * <code>repeated int32 samples = 1;</code>
     */
    int getSamplesCount();
    /**
     * <code>repeated int32 samples = 1;</code>
     */
    int getSamples(int index);
  }
  /**
   * Protobuf type {@code util.Repeated}
   */
  public  static final class Repeated extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:util.Repeated)
      RepeatedOrBuilder {
    // Use Repeated.newBuilder() to construct.
    private Repeated(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Repeated() {
      samples_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Repeated(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                samples_ = new java.util.ArrayList<Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              samples_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                samples_ = new java.util.ArrayList<Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                samples_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          samples_ = java.util.Collections.unmodifiableList(samples_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RepeatedProto.internal_static_util_Repeated_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RepeatedProto.internal_static_util_Repeated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Repeated.class, Builder.class);
    }

    public static final int SAMPLES_FIELD_NUMBER = 1;
    private java.util.List<Integer> samples_;
    /**
     * <code>repeated int32 samples = 1;</code>
     */
    public java.util.List<Integer>
        getSamplesList() {
      return samples_;
    }
    /**
     * <code>repeated int32 samples = 1;</code>
     */
    public int getSamplesCount() {
      return samples_.size();
    }
    /**
     * <code>repeated int32 samples = 1;</code>
     */
    public int getSamples(int index) {
      return samples_.get(index);
    }
    private int samplesMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getSamplesList().size() > 0) {
        output.writeRawVarint32(10);
        output.writeRawVarint32(samplesMemoizedSerializedSize);
      }
      for (int i = 0; i < samples_.size(); i++) {
        output.writeInt32NoTag(samples_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < samples_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(samples_.get(i));
        }
        size += dataSize;
        if (!getSamplesList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        samplesMemoizedSerializedSize = dataSize;
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static Repeated parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Repeated parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Repeated parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Repeated parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Repeated parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Repeated parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Repeated parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Repeated parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Repeated parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Repeated parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Repeated prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code util.Repeated}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:util.Repeated)
        RepeatedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RepeatedProto.internal_static_util_Repeated_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RepeatedProto.internal_static_util_Repeated_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Repeated.class, Builder.class);
      }

      // Construct using com.streamsets.pipeline.lib.util.RepeatedProto.Repeated.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        samples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RepeatedProto.internal_static_util_Repeated_descriptor;
      }

      public Repeated getDefaultInstanceForType() {
        return Repeated.getDefaultInstance();
      }

      public Repeated build() {
        Repeated result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Repeated buildPartial() {
        Repeated result = new Repeated(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          samples_ = java.util.Collections.unmodifiableList(samples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.samples_ = samples_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Repeated) {
          return mergeFrom((Repeated)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Repeated other) {
        if (other == Repeated.getDefaultInstance()) return this;
        if (!other.samples_.isEmpty()) {
          if (samples_.isEmpty()) {
            samples_ = other.samples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSamplesIsMutable();
            samples_.addAll(other.samples_);
          }
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Repeated parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Repeated) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<Integer> samples_ = java.util.Collections.emptyList();
      private void ensureSamplesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          samples_ = new java.util.ArrayList<Integer>(samples_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public java.util.List<Integer>
          getSamplesList() {
        return java.util.Collections.unmodifiableList(samples_);
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public int getSamplesCount() {
        return samples_.size();
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public int getSamples(int index) {
        return samples_.get(index);
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public Builder setSamples(
          int index, int value) {
        ensureSamplesIsMutable();
        samples_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public Builder addSamples(int value) {
        ensureSamplesIsMutable();
        samples_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public Builder addAllSamples(
          Iterable<? extends Integer> values) {
        ensureSamplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, samples_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 samples = 1;</code>
       */
      public Builder clearSamples() {
        samples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:util.Repeated)
    }

    // @@protoc_insertion_point(class_scope:util.Repeated)
    private static final Repeated DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Repeated();
    }

    public static Repeated getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Repeated>
        PARSER = new com.google.protobuf.AbstractParser<Repeated>() {
      public Repeated parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Repeated(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Repeated> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Repeated> getParserForType() {
      return PARSER;
    }

    public Repeated getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_util_Repeated_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_util_Repeated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016Repeated.proto\022\004util\"\033\n\010Repeated\022\017\n\007sa" +
      "mples\030\001 \003(\005B1\n com.streamsets.pipeline.l" +
      "ib.utilB\rRepeatedProtob\006proto3"
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
        }, assigner);
    internal_static_util_Repeated_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_util_Repeated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_util_Repeated_descriptor,
        new String[] { "Samples", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
