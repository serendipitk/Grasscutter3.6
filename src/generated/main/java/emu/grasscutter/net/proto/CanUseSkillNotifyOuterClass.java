// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CanUseSkillNotify.proto

package emu.grasscutter.net.proto;

public final class CanUseSkillNotifyOuterClass {
  private CanUseSkillNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CanUseSkillNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CanUseSkillNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isCanUseSkill = 2;</code>
     * @return The isCanUseSkill.
     */
    boolean getIsCanUseSkill();
  }
  /**
   * Protobuf type {@code CanUseSkillNotify}
   */
  public static final class CanUseSkillNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CanUseSkillNotify)
      CanUseSkillNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CanUseSkillNotify.newBuilder() to construct.
    private CanUseSkillNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CanUseSkillNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CanUseSkillNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CanUseSkillNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              isCanUseSkill_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.class, emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code CanUseSkillNotify.BKAHAJDKDCC}
     */
    public enum BKAHAJDKDCC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1069;</code>
       */
      PEPPOHPHJOJ(1, 1069),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BKAHAJDKDCC DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1069;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1069;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static BKAHAJDKDCC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BKAHAJDKDCC forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1069: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BKAHAJDKDCC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BKAHAJDKDCC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BKAHAJDKDCC>() {
              public BKAHAJDKDCC findValueByNumber(int number) {
                return BKAHAJDKDCC.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final BKAHAJDKDCC[] VALUES = getStaticValuesArray();
      private static BKAHAJDKDCC[] getStaticValuesArray() {
        return new BKAHAJDKDCC[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static BKAHAJDKDCC valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private BKAHAJDKDCC(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:CanUseSkillNotify.BKAHAJDKDCC)
    }

    public static final int ISCANUSESKILL_FIELD_NUMBER = 2;
    private boolean isCanUseSkill_;
    /**
     * <code>bool isCanUseSkill = 2;</code>
     * @return The isCanUseSkill.
     */
    @java.lang.Override
    public boolean getIsCanUseSkill() {
      return isCanUseSkill_;
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
      if (isCanUseSkill_ != false) {
        output.writeBool(2, isCanUseSkill_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isCanUseSkill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isCanUseSkill_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify other = (emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify) obj;

      if (getIsCanUseSkill()
          != other.getIsCanUseSkill()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ISCANUSESKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCanUseSkill());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify prototype) {
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
     * Protobuf type {@code CanUseSkillNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CanUseSkillNotify)
        emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.class, emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.newBuilder()
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
        isCanUseSkill_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify build() {
        emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify buildPartial() {
        emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify result = new emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify(this);
        result.isCanUseSkill_ = isCanUseSkill_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify other) {
        if (other == emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify.getDefaultInstance()) return this;
        if (other.getIsCanUseSkill() != false) {
          setIsCanUseSkill(other.getIsCanUseSkill());
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
        emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isCanUseSkill_ ;
      /**
       * <code>bool isCanUseSkill = 2;</code>
       * @return The isCanUseSkill.
       */
      @java.lang.Override
      public boolean getIsCanUseSkill() {
        return isCanUseSkill_;
      }
      /**
       * <code>bool isCanUseSkill = 2;</code>
       * @param value The isCanUseSkill to set.
       * @return This builder for chaining.
       */
      public Builder setIsCanUseSkill(boolean value) {
        
        isCanUseSkill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isCanUseSkill = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCanUseSkill() {
        
        isCanUseSkill_ = false;
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


      // @@protoc_insertion_point(builder_scope:CanUseSkillNotify)
    }

    // @@protoc_insertion_point(class_scope:CanUseSkillNotify)
    private static final emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify();
    }

    public static emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CanUseSkillNotify>
        PARSER = new com.google.protobuf.AbstractParser<CanUseSkillNotify>() {
      @java.lang.Override
      public CanUseSkillNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CanUseSkillNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CanUseSkillNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CanUseSkillNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CanUseSkillNotifyOuterClass.CanUseSkillNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CanUseSkillNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CanUseSkillNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CanUseSkillNotify.proto\"{\n\021CanUseSkill" +
      "Notify\022\025\n\risCanUseSkill\030\002 \001(\010\"O\n\013BKAHAJD" +
      "KDCC\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\255\010\022\017\n\013DCDN" +
      "ILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CanUseSkillNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CanUseSkillNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CanUseSkillNotify_descriptor,
        new java.lang.String[] { "IsCanUseSkill", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}