// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NALOPCHENIP.proto

package emu.grasscutter.net.proto;

public final class NALOPCHENIPOuterClass {
  private NALOPCHENIPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NALOPCHENIPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NALOPCHENIP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 height = 8;</code>
     * @return The height.
     */
    int getHeight();

    /**
     * <code>bytes data = 6;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>uint32 JKMCCOJKLKF = 14;</code>
     * @return The jKMCCOJKLKF.
     */
    int getJKMCCOJKLKF();
  }
  /**
   * <pre>
   * Name: NALOPCHENIP
   * </pre>
   *
   * Protobuf type {@code NALOPCHENIP}
   */
  public static final class NALOPCHENIP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NALOPCHENIP)
      NALOPCHENIPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NALOPCHENIP.newBuilder() to construct.
    private NALOPCHENIP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NALOPCHENIP() {
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NALOPCHENIP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.internal_static_NALOPCHENIP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.internal_static_NALOPCHENIP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.class, emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.Builder.class);
    }

    public static final int HEIGHT_FIELD_NUMBER = 8;
    private int height_ = 0;
    /**
     * <code>uint32 height = 8;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }

    public static final int DATA_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 6;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int JKMCCOJKLKF_FIELD_NUMBER = 14;
    private int jKMCCOJKLKF_ = 0;
    /**
     * <code>uint32 JKMCCOJKLKF = 14;</code>
     * @return The jKMCCOJKLKF.
     */
    @java.lang.Override
    public int getJKMCCOJKLKF() {
      return jKMCCOJKLKF_;
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
      if (!data_.isEmpty()) {
        output.writeBytes(6, data_);
      }
      if (height_ != 0) {
        output.writeUInt32(8, height_);
      }
      if (jKMCCOJKLKF_ != 0) {
        output.writeUInt32(14, jKMCCOJKLKF_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, data_);
      }
      if (height_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, height_);
      }
      if (jKMCCOJKLKF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, jKMCCOJKLKF_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP other = (emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP) obj;

      if (getHeight()
          != other.getHeight()) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (getJKMCCOJKLKF()
          != other.getJKMCCOJKLKF()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + JKMCCOJKLKF_FIELD_NUMBER;
      hash = (53 * hash) + getJKMCCOJKLKF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP prototype) {
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
     * <pre>
     * Name: NALOPCHENIP
     * </pre>
     *
     * Protobuf type {@code NALOPCHENIP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NALOPCHENIP)
        emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.internal_static_NALOPCHENIP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.internal_static_NALOPCHENIP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.class, emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        height_ = 0;
        data_ = com.google.protobuf.ByteString.EMPTY;
        jKMCCOJKLKF_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.internal_static_NALOPCHENIP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP build() {
        emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP buildPartial() {
        emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP result = new emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.height_ = height_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.data_ = data_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.jKMCCOJKLKF_ = jKMCCOJKLKF_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP) {
          return mergeFrom((emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP other) {
        if (other == emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP.getDefaultInstance()) return this;
        if (other.getHeight() != 0) {
          setHeight(other.getHeight());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        if (other.getJKMCCOJKLKF() != 0) {
          setJKMCCOJKLKF(other.getJKMCCOJKLKF());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 50: {
                data_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 50
              case 64: {
                height_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 112: {
                jKMCCOJKLKF_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int height_ ;
      /**
       * <code>uint32 height = 8;</code>
       * @return The height.
       */
      @java.lang.Override
      public int getHeight() {
        return height_;
      }
      /**
       * <code>uint32 height = 8;</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(int value) {
        
        height_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 height = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000001);
        height_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 6;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 6;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        data_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private int jKMCCOJKLKF_ ;
      /**
       * <code>uint32 JKMCCOJKLKF = 14;</code>
       * @return The jKMCCOJKLKF.
       */
      @java.lang.Override
      public int getJKMCCOJKLKF() {
        return jKMCCOJKLKF_;
      }
      /**
       * <code>uint32 JKMCCOJKLKF = 14;</code>
       * @param value The jKMCCOJKLKF to set.
       * @return This builder for chaining.
       */
      public Builder setJKMCCOJKLKF(int value) {
        
        jKMCCOJKLKF_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKMCCOJKLKF = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKMCCOJKLKF() {
        bitField0_ = (bitField0_ & ~0x00000004);
        jKMCCOJKLKF_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NALOPCHENIP)
    }

    // @@protoc_insertion_point(class_scope:NALOPCHENIP)
    private static final emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP();
    }

    public static emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NALOPCHENIP>
        PARSER = new com.google.protobuf.AbstractParser<NALOPCHENIP>() {
      @java.lang.Override
      public NALOPCHENIP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<NALOPCHENIP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NALOPCHENIP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NALOPCHENIPOuterClass.NALOPCHENIP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NALOPCHENIP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NALOPCHENIP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NALOPCHENIP.proto\"@\n\013NALOPCHENIP\022\016\n\006he" +
      "ight\030\010 \001(\r\022\014\n\004data\030\006 \001(\014\022\023\n\013JKMCCOJKLKF\030" +
      "\016 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NALOPCHENIP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NALOPCHENIP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NALOPCHENIP_descriptor,
        new java.lang.String[] { "Height", "Data", "JKMCCOJKLKF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
