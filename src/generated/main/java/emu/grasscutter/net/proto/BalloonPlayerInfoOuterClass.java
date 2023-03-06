// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BalloonPlayerInfo.proto

package emu.grasscutter.net.proto;

public final class BalloonPlayerInfoOuterClass {
  private BalloonPlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BalloonPlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BalloonPlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 comboDisableTime = 8;</code>
     * @return The comboDisableTime.
     */
    int getComboDisableTime();

    /**
     * <code>uint32 curScore = 13;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 combo = 6;</code>
     * @return The combo.
     */
    int getCombo();
  }
  /**
   * Protobuf type {@code BalloonPlayerInfo}
   */
  public static final class BalloonPlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BalloonPlayerInfo)
      BalloonPlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BalloonPlayerInfo.newBuilder() to construct.
    private BalloonPlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BalloonPlayerInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BalloonPlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.internal_static_BalloonPlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.internal_static_BalloonPlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.class, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.Builder.class);
    }

    public static final int COMBODISABLETIME_FIELD_NUMBER = 8;
    private int comboDisableTime_ = 0;
    /**
     * <code>uint32 comboDisableTime = 8;</code>
     * @return The comboDisableTime.
     */
    @java.lang.Override
    public int getComboDisableTime() {
      return comboDisableTime_;
    }

    public static final int CURSCORE_FIELD_NUMBER = 13;
    private int curScore_ = 0;
    /**
     * <code>uint32 curScore = 13;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int COMBO_FIELD_NUMBER = 6;
    private int combo_ = 0;
    /**
     * <code>uint32 combo = 6;</code>
     * @return The combo.
     */
    @java.lang.Override
    public int getCombo() {
      return combo_;
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
      if (combo_ != 0) {
        output.writeUInt32(6, combo_);
      }
      if (comboDisableTime_ != 0) {
        output.writeUInt32(8, comboDisableTime_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(13, curScore_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (combo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, combo_);
      }
      if (comboDisableTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, comboDisableTime_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, curScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo other = (emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo) obj;

      if (getComboDisableTime()
          != other.getComboDisableTime()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getCombo()
          != other.getCombo()) return false;
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
      hash = (37 * hash) + COMBODISABLETIME_FIELD_NUMBER;
      hash = (53 * hash) + getComboDisableTime();
      hash = (37 * hash) + CURSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + COMBO_FIELD_NUMBER;
      hash = (53 * hash) + getCombo();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo prototype) {
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
     * Protobuf type {@code BalloonPlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BalloonPlayerInfo)
        emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.internal_static_BalloonPlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.internal_static_BalloonPlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.class, emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.newBuilder()
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
        comboDisableTime_ = 0;
        curScore_ = 0;
        uid_ = 0;
        combo_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.internal_static_BalloonPlayerInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo build() {
        emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo buildPartial() {
        emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo result = new emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.comboDisableTime_ = comboDisableTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.curScore_ = curScore_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.combo_ = combo_;
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
        if (other instanceof emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo other) {
        if (other == emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo.getDefaultInstance()) return this;
        if (other.getComboDisableTime() != 0) {
          setComboDisableTime(other.getComboDisableTime());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getCombo() != 0) {
          setCombo(other.getCombo());
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
              case 48: {
                combo_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 64: {
                comboDisableTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 80: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 104: {
                curScore_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int comboDisableTime_ ;
      /**
       * <code>uint32 comboDisableTime = 8;</code>
       * @return The comboDisableTime.
       */
      @java.lang.Override
      public int getComboDisableTime() {
        return comboDisableTime_;
      }
      /**
       * <code>uint32 comboDisableTime = 8;</code>
       * @param value The comboDisableTime to set.
       * @return This builder for chaining.
       */
      public Builder setComboDisableTime(int value) {
        
        comboDisableTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 comboDisableTime = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearComboDisableTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        comboDisableTime_ = 0;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 curScore = 13;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 curScore = 13;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curScore = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = 0;
        onChanged();
        return this;
      }

      private int combo_ ;
      /**
       * <code>uint32 combo = 6;</code>
       * @return The combo.
       */
      @java.lang.Override
      public int getCombo() {
        return combo_;
      }
      /**
       * <code>uint32 combo = 6;</code>
       * @param value The combo to set.
       * @return This builder for chaining.
       */
      public Builder setCombo(int value) {
        
        combo_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combo = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombo() {
        bitField0_ = (bitField0_ & ~0x00000008);
        combo_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BalloonPlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:BalloonPlayerInfo)
    private static final emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo();
    }

    public static emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BalloonPlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<BalloonPlayerInfo>() {
      @java.lang.Override
      public BalloonPlayerInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BalloonPlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BalloonPlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BalloonPlayerInfoOuterClass.BalloonPlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BalloonPlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BalloonPlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BalloonPlayerInfo.proto\"[\n\021BalloonPlay" +
      "erInfo\022\030\n\020comboDisableTime\030\010 \001(\r\022\020\n\010curS" +
      "core\030\r \001(\r\022\013\n\003uid\030\n \001(\r\022\r\n\005combo\030\006 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BalloonPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BalloonPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BalloonPlayerInfo_descriptor,
        new java.lang.String[] { "ComboDisableTime", "CurScore", "Uid", "Combo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
