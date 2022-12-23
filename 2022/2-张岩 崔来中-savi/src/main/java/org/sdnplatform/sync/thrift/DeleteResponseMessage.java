package org.sdnplatform.sync.thrift;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SuppressWarnings("all") public class DeleteResponseMessage implements org.apache.thrift.TBase<DeleteResponseMessage, DeleteResponseMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteResponseMessage");
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DELETED_FIELD_DESC = new org.apache.thrift.protocol.TField("deleted", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteResponseMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteResponseMessageTupleSchemeFactory());
  }
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    DELETED((short)2, "deleted");
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
          return HEADER;
          return DELETED;
        default:
          return null;
      }
    }
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
    private final short _thriftId;
    private final String _fieldName;
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
    public short getThriftFieldId() {
      return _thriftId;
    }
    public String getFieldName() {
      return _fieldName;
    }
  }
  private static final int __DELETED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HEADER,_Fields.DELETED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.DELETED, new org.apache.thrift.meta_data.FieldMetaData("deleted", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteResponseMessage.class, metaDataMap);
  }
  public DeleteResponseMessage() {
  }
  public DeleteResponseMessage(DeleteResponseMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    this.deleted = other.deleted;
  }
  public DeleteResponseMessage deepCopy() {
    return new DeleteResponseMessage(this);
  }
  @Override
  public void clear() {
    this.header = null;
    setDeletedIsSet(false);
    this.deleted = false;
  }
  public AsyncMessageHeader getHeader() {
    return this.header;
  }
  public DeleteResponseMessage setHeader(AsyncMessageHeader header) {
    this.header = header;
    return this;
  }
  public void unsetHeader() {
    this.header = null;
  }
  public boolean isSetHeader() {
    return this.header != null;
  }
  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }
  public boolean isDeleted() {
    return this.deleted;
  }
  public DeleteResponseMessage setDeleted(boolean deleted) {
    this.deleted = deleted;
    setDeletedIsSet(true);
    return this;
  }
  public void unsetDeleted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETED_ISSET_ID);
  }
  public boolean isSetDeleted() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETED_ISSET_ID);
  }
  public void setDeletedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETED_ISSET_ID, value);
  }
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;
    case DELETED:
      if (value == null) {
        unsetDeleted();
      } else {
        setDeleted((Boolean)value);
      }
      break;
    }
  }
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();
    case DELETED:
      return Boolean.valueOf(isDeleted());
    }
    throw new IllegalStateException();
  }
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }
    switch (field) {
    case HEADER:
      return isSetHeader();
    case DELETED:
      return isSetDeleted();
    }
    throw new IllegalStateException();
  }
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteResponseMessage)
      return this.equals((DeleteResponseMessage)that);
    return false;
  }
  public boolean equals(DeleteResponseMessage that) {
    if (that == null)
      return false;
    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }
    boolean this_present_deleted = true && this.isSetDeleted();
    boolean that_present_deleted = true && that.isSetDeleted();
    if (this_present_deleted || that_present_deleted) {
      if (!(this_present_deleted && that_present_deleted))
        return false;
      if (this.deleted != that.deleted)
        return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return 0;
  }
  public int compareTo(DeleteResponseMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    int lastComparison = 0;
    DeleteResponseMessage typedOther = (DeleteResponseMessage)other;
    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleted()).compareTo(typedOther.isSetDeleted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleted, typedOther.deleted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DeleteResponseMessage(");
    boolean first = true;
    if (isSetHeader()) {
      sb.append("header:");
      if (this.header == null) {
        sb.append("null");
      } else {
        sb.append(this.header);
      }
      first = false;
    }
    if (isSetDeleted()) {
      if (!first) sb.append(", ");
      sb.append("deleted:");
      sb.append(this.deleted);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }
  public void validate() throws org.apache.thrift.TException {
    if (header != null) {
      header.validate();
    }
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }
  private static class DeleteResponseMessageStandardSchemeFactory implements SchemeFactory {
    public DeleteResponseMessageStandardScheme getScheme() {
      return new DeleteResponseMessageStandardScheme();
    }
  }
  private static class DeleteResponseMessageStandardScheme extends StandardScheme<DeleteResponseMessage> {
    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteResponseMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.deleted = iprot.readBool();
              struct.setDeletedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }
    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteResponseMessage struct) throws org.apache.thrift.TException {
      struct.validate();
      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        if (struct.isSetHeader()) {
          oprot.writeFieldBegin(HEADER_FIELD_DESC);
          struct.header.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDeleted()) {
        oprot.writeFieldBegin(DELETED_FIELD_DESC);
        oprot.writeBool(struct.deleted);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }
  private static class DeleteResponseMessageTupleSchemeFactory implements SchemeFactory {
    public DeleteResponseMessageTupleScheme getScheme() {
      return new DeleteResponseMessageTupleScheme();
    }
  }
  private static class DeleteResponseMessageTupleScheme extends TupleScheme<DeleteResponseMessage> {
    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHeader()) {
        optionals.set(0);
      }
      if (struct.isSetDeleted()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHeader()) {
        struct.header.write(oprot);
      }
      if (struct.isSetDeleted()) {
        oprot.writeBool(struct.deleted);
      }
    }
    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.header = new AsyncMessageHeader();
        struct.header.read(iprot);
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.deleted = iprot.readBool();
        struct.setDeletedIsSet(true);
      }
    }
  }
}
