// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ONGFFNHKKIA.proto

package emu.grasscutter.net.proto;

public final class ONGFFNHKKIAOuterClass {
  private ONGFFNHKKIAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ONGFFNHKKIAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ONGFFNHKKIA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> 
        getLCBIEAMEBPFList();
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getLCBIEAMEBPF(int index);
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    int getLCBIEAMEBPFCount();
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder> 
        getLCBIEAMEBPFOrBuilderList();
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder getLCBIEAMEBPFOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: ONGFFNHKKIA
   * </pre>
   *
   * Protobuf type {@code ONGFFNHKKIA}
   */
  public static final class ONGFFNHKKIA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ONGFFNHKKIA)
      ONGFFNHKKIAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ONGFFNHKKIA.newBuilder() to construct.
    private ONGFFNHKKIA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ONGFFNHKKIA() {
      lCBIEAMEBPF_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ONGFFNHKKIA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.internal_static_ONGFFNHKKIA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.internal_static_ONGFFNHKKIA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.class, emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int LCBIEAMEBPF_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> lCBIEAMEBPF_;
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> getLCBIEAMEBPFList() {
      return lCBIEAMEBPF_;
    }
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder> 
        getLCBIEAMEBPFOrBuilderList() {
      return lCBIEAMEBPF_;
    }
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    @java.lang.Override
    public int getLCBIEAMEBPFCount() {
      return lCBIEAMEBPF_.size();
    }
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getLCBIEAMEBPF(int index) {
      return lCBIEAMEBPF_.get(index);
    }
    /**
     * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder getLCBIEAMEBPFOrBuilder(
        int index) {
      return lCBIEAMEBPF_.get(index);
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
      for (int i = 0; i < lCBIEAMEBPF_.size(); i++) {
        output.writeMessage(4, lCBIEAMEBPF_.get(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < lCBIEAMEBPF_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, lCBIEAMEBPF_.get(i));
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA other = (emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getLCBIEAMEBPFList()
          .equals(other.getLCBIEAMEBPFList())) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getLCBIEAMEBPFCount() > 0) {
        hash = (37 * hash) + LCBIEAMEBPF_FIELD_NUMBER;
        hash = (53 * hash) + getLCBIEAMEBPFList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA prototype) {
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
     * Name: ONGFFNHKKIA
     * </pre>
     *
     * Protobuf type {@code ONGFFNHKKIA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ONGFFNHKKIA)
        emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.internal_static_ONGFFNHKKIA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.internal_static_ONGFFNHKKIA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.class, emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.newBuilder()
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
        levelId_ = 0;
        if (lCBIEAMEBPFBuilder_ == null) {
          lCBIEAMEBPF_ = java.util.Collections.emptyList();
        } else {
          lCBIEAMEBPF_ = null;
          lCBIEAMEBPFBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.internal_static_ONGFFNHKKIA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA build() {
        emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA buildPartial() {
        emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA result = new emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA result) {
        if (lCBIEAMEBPFBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            lCBIEAMEBPF_ = java.util.Collections.unmodifiableList(lCBIEAMEBPF_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.lCBIEAMEBPF_ = lCBIEAMEBPF_;
        } else {
          result.lCBIEAMEBPF_ = lCBIEAMEBPFBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA) {
          return mergeFrom((emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA other) {
        if (other == emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (lCBIEAMEBPFBuilder_ == null) {
          if (!other.lCBIEAMEBPF_.isEmpty()) {
            if (lCBIEAMEBPF_.isEmpty()) {
              lCBIEAMEBPF_ = other.lCBIEAMEBPF_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLCBIEAMEBPFIsMutable();
              lCBIEAMEBPF_.addAll(other.lCBIEAMEBPF_);
            }
            onChanged();
          }
        } else {
          if (!other.lCBIEAMEBPF_.isEmpty()) {
            if (lCBIEAMEBPFBuilder_.isEmpty()) {
              lCBIEAMEBPFBuilder_.dispose();
              lCBIEAMEBPFBuilder_ = null;
              lCBIEAMEBPF_ = other.lCBIEAMEBPF_;
              bitField0_ = (bitField0_ & ~0x00000002);
              lCBIEAMEBPFBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLCBIEAMEBPFFieldBuilder() : null;
            } else {
              lCBIEAMEBPFBuilder_.addAllMessages(other.lCBIEAMEBPF_);
            }
          }
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
              case 34: {
                emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI m =
                    input.readMessage(
                        emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.parser(),
                        extensionRegistry);
                if (lCBIEAMEBPFBuilder_ == null) {
                  ensureLCBIEAMEBPFIsMutable();
                  lCBIEAMEBPF_.add(m);
                } else {
                  lCBIEAMEBPFBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 104: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> lCBIEAMEBPF_ =
        java.util.Collections.emptyList();
      private void ensureLCBIEAMEBPFIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          lCBIEAMEBPF_ = new java.util.ArrayList<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI>(lCBIEAMEBPF_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder> lCBIEAMEBPFBuilder_;

      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> getLCBIEAMEBPFList() {
        if (lCBIEAMEBPFBuilder_ == null) {
          return java.util.Collections.unmodifiableList(lCBIEAMEBPF_);
        } else {
          return lCBIEAMEBPFBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public int getLCBIEAMEBPFCount() {
        if (lCBIEAMEBPFBuilder_ == null) {
          return lCBIEAMEBPF_.size();
        } else {
          return lCBIEAMEBPFBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getLCBIEAMEBPF(int index) {
        if (lCBIEAMEBPFBuilder_ == null) {
          return lCBIEAMEBPF_.get(index);
        } else {
          return lCBIEAMEBPFBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder setLCBIEAMEBPF(
          int index, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI value) {
        if (lCBIEAMEBPFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.set(index, value);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder setLCBIEAMEBPF(
          int index, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder builderForValue) {
        if (lCBIEAMEBPFBuilder_ == null) {
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.set(index, builderForValue.build());
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder addLCBIEAMEBPF(emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI value) {
        if (lCBIEAMEBPFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.add(value);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder addLCBIEAMEBPF(
          int index, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI value) {
        if (lCBIEAMEBPFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.add(index, value);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder addLCBIEAMEBPF(
          emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder builderForValue) {
        if (lCBIEAMEBPFBuilder_ == null) {
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.add(builderForValue.build());
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder addLCBIEAMEBPF(
          int index, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder builderForValue) {
        if (lCBIEAMEBPFBuilder_ == null) {
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.add(index, builderForValue.build());
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder addAllLCBIEAMEBPF(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI> values) {
        if (lCBIEAMEBPFBuilder_ == null) {
          ensureLCBIEAMEBPFIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, lCBIEAMEBPF_);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder clearLCBIEAMEBPF() {
        if (lCBIEAMEBPFBuilder_ == null) {
          lCBIEAMEBPF_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public Builder removeLCBIEAMEBPF(int index) {
        if (lCBIEAMEBPFBuilder_ == null) {
          ensureLCBIEAMEBPFIsMutable();
          lCBIEAMEBPF_.remove(index);
          onChanged();
        } else {
          lCBIEAMEBPFBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder getLCBIEAMEBPFBuilder(
          int index) {
        return getLCBIEAMEBPFFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder getLCBIEAMEBPFOrBuilder(
          int index) {
        if (lCBIEAMEBPFBuilder_ == null) {
          return lCBIEAMEBPF_.get(index);  } else {
          return lCBIEAMEBPFBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder> 
           getLCBIEAMEBPFOrBuilderList() {
        if (lCBIEAMEBPFBuilder_ != null) {
          return lCBIEAMEBPFBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(lCBIEAMEBPF_);
        }
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder addLCBIEAMEBPFBuilder() {
        return getLCBIEAMEBPFFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.getDefaultInstance());
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder addLCBIEAMEBPFBuilder(
          int index) {
        return getLCBIEAMEBPFFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.getDefaultInstance());
      }
      /**
       * <code>repeated .JONHAPLJANI LCBIEAMEBPF = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder> 
           getLCBIEAMEBPFBuilderList() {
        return getLCBIEAMEBPFFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder> 
          getLCBIEAMEBPFFieldBuilder() {
        if (lCBIEAMEBPFBuilder_ == null) {
          lCBIEAMEBPFBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder>(
                  lCBIEAMEBPF_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          lCBIEAMEBPF_ = null;
        }
        return lCBIEAMEBPFBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ONGFFNHKKIA)
    }

    // @@protoc_insertion_point(class_scope:ONGFFNHKKIA)
    private static final emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA();
    }

    public static emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ONGFFNHKKIA>
        PARSER = new com.google.protobuf.AbstractParser<ONGFFNHKKIA>() {
      @java.lang.Override
      public ONGFFNHKKIA parsePartialFrom(
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

    public static com.google.protobuf.Parser<ONGFFNHKKIA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ONGFFNHKKIA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ONGFFNHKKIAOuterClass.ONGFFNHKKIA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ONGFFNHKKIA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ONGFFNHKKIA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ONGFFNHKKIA.proto\032\021JONHAPLJANI.proto\"B" +
      "\n\013ONGFFNHKKIA\022\020\n\010level_id\030\r \001(\r\022!\n\013LCBIE" +
      "AMEBPF\030\004 \003(\0132\014.JONHAPLJANIB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JONHAPLJANIOuterClass.getDescriptor(),
        });
    internal_static_ONGFFNHKKIA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ONGFFNHKKIA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ONGFFNHKKIA_descriptor,
        new java.lang.String[] { "LevelId", "LCBIEAMEBPF", });
    emu.grasscutter.net.proto.JONHAPLJANIOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
