// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArenaChallengeMonsterLevel.proto

package emu.grasscutter.net.proto;

public final class ArenaChallengeMonsterLevelOuterClass {
  private ArenaChallengeMonsterLevelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ArenaChallengeMonsterLevelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ArenaChallengeMonsterLevel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BCHEDLFFNKC = 11;</code>
     * @return The bCHEDLFFNKC.
     */
    int getBCHEDLFFNKC();

    /**
     * <code>uint32 NEFKFHIPLHG = 1;</code>
     * @return The nEFKFHIPLHG.
     */
    int getNEFKFHIPLHG();
  }
  /**
   * <pre>
   * Name: MOOPCKFOLNC
   * </pre>
   *
   * Protobuf type {@code ArenaChallengeMonsterLevel}
   */
  public static final class ArenaChallengeMonsterLevel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ArenaChallengeMonsterLevel)
      ArenaChallengeMonsterLevelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArenaChallengeMonsterLevel.newBuilder() to construct.
    private ArenaChallengeMonsterLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArenaChallengeMonsterLevel() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ArenaChallengeMonsterLevel();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.class, emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.Builder.class);
    }

    public static final int BCHEDLFFNKC_FIELD_NUMBER = 11;
    private int bCHEDLFFNKC_ = 0;
    /**
     * <code>uint32 BCHEDLFFNKC = 11;</code>
     * @return The bCHEDLFFNKC.
     */
    @java.lang.Override
    public int getBCHEDLFFNKC() {
      return bCHEDLFFNKC_;
    }

    public static final int NEFKFHIPLHG_FIELD_NUMBER = 1;
    private int nEFKFHIPLHG_ = 0;
    /**
     * <code>uint32 NEFKFHIPLHG = 1;</code>
     * @return The nEFKFHIPLHG.
     */
    @java.lang.Override
    public int getNEFKFHIPLHG() {
      return nEFKFHIPLHG_;
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
      if (nEFKFHIPLHG_ != 0) {
        output.writeUInt32(1, nEFKFHIPLHG_);
      }
      if (bCHEDLFFNKC_ != 0) {
        output.writeUInt32(11, bCHEDLFFNKC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nEFKFHIPLHG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, nEFKFHIPLHG_);
      }
      if (bCHEDLFFNKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, bCHEDLFFNKC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel other = (emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel) obj;

      if (getBCHEDLFFNKC()
          != other.getBCHEDLFFNKC()) return false;
      if (getNEFKFHIPLHG()
          != other.getNEFKFHIPLHG()) return false;
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
      hash = (37 * hash) + BCHEDLFFNKC_FIELD_NUMBER;
      hash = (53 * hash) + getBCHEDLFFNKC();
      hash = (37 * hash) + NEFKFHIPLHG_FIELD_NUMBER;
      hash = (53 * hash) + getNEFKFHIPLHG();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel prototype) {
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
     * Name: MOOPCKFOLNC
     * </pre>
     *
     * Protobuf type {@code ArenaChallengeMonsterLevel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ArenaChallengeMonsterLevel)
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.class, emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.newBuilder()
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
        bCHEDLFFNKC_ = 0;
        nEFKFHIPLHG_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel build() {
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel buildPartial() {
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel result = new emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.bCHEDLFFNKC_ = bCHEDLFFNKC_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nEFKFHIPLHG_ = nEFKFHIPLHG_;
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
        if (other instanceof emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel) {
          return mergeFrom((emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel other) {
        if (other == emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.getDefaultInstance()) return this;
        if (other.getBCHEDLFFNKC() != 0) {
          setBCHEDLFFNKC(other.getBCHEDLFFNKC());
        }
        if (other.getNEFKFHIPLHG() != 0) {
          setNEFKFHIPLHG(other.getNEFKFHIPLHG());
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
              case 8: {
                nEFKFHIPLHG_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 88: {
                bCHEDLFFNKC_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int bCHEDLFFNKC_ ;
      /**
       * <code>uint32 BCHEDLFFNKC = 11;</code>
       * @return The bCHEDLFFNKC.
       */
      @java.lang.Override
      public int getBCHEDLFFNKC() {
        return bCHEDLFFNKC_;
      }
      /**
       * <code>uint32 BCHEDLFFNKC = 11;</code>
       * @param value The bCHEDLFFNKC to set.
       * @return This builder for chaining.
       */
      public Builder setBCHEDLFFNKC(int value) {
        
        bCHEDLFFNKC_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BCHEDLFFNKC = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBCHEDLFFNKC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bCHEDLFFNKC_ = 0;
        onChanged();
        return this;
      }

      private int nEFKFHIPLHG_ ;
      /**
       * <code>uint32 NEFKFHIPLHG = 1;</code>
       * @return The nEFKFHIPLHG.
       */
      @java.lang.Override
      public int getNEFKFHIPLHG() {
        return nEFKFHIPLHG_;
      }
      /**
       * <code>uint32 NEFKFHIPLHG = 1;</code>
       * @param value The nEFKFHIPLHG to set.
       * @return This builder for chaining.
       */
      public Builder setNEFKFHIPLHG(int value) {
        
        nEFKFHIPLHG_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NEFKFHIPLHG = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNEFKFHIPLHG() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nEFKFHIPLHG_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ArenaChallengeMonsterLevel)
    }

    // @@protoc_insertion_point(class_scope:ArenaChallengeMonsterLevel)
    private static final emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel();
    }

    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArenaChallengeMonsterLevel>
        PARSER = new com.google.protobuf.AbstractParser<ArenaChallengeMonsterLevel>() {
      @java.lang.Override
      public ArenaChallengeMonsterLevel parsePartialFrom(
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

    public static com.google.protobuf.Parser<ArenaChallengeMonsterLevel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ArenaChallengeMonsterLevel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ArenaChallengeMonsterLevel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ArenaChallengeMonsterLevel.proto\"F\n\032Ar" +
      "enaChallengeMonsterLevel\022\023\n\013BCHEDLFFNKC\030" +
      "\013 \001(\r\022\023\n\013NEFKFHIPLHG\030\001 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ArenaChallengeMonsterLevel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ArenaChallengeMonsterLevel_descriptor,
        new java.lang.String[] { "BCHEDLFFNKC", "NEFKFHIPLHG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
