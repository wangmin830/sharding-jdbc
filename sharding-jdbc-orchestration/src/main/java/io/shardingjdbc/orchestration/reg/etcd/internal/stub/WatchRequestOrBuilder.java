// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface WatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.WatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.WatchCreateRequest create_request = 1;</code>
   */
  boolean hasCreateRequest();
  /**
   * <code>.etcdserverpb.WatchCreateRequest create_request = 1;</code>
   */
  WatchCreateRequest getCreateRequest();
  /**
   * <code>.etcdserverpb.WatchCreateRequest create_request = 1;</code>
   */
  WatchCreateRequestOrBuilder getCreateRequestOrBuilder();

  /**
   * <code>.etcdserverpb.WatchCancelRequest cancel_request = 2;</code>
   */
  boolean hasCancelRequest();
  /**
   * <code>.etcdserverpb.WatchCancelRequest cancel_request = 2;</code>
   */
  WatchCancelRequest getCancelRequest();
  /**
   * <code>.etcdserverpb.WatchCancelRequest cancel_request = 2;</code>
   */
  WatchCancelRequestOrBuilder getCancelRequestOrBuilder();

  WatchRequest.RequestUnionCase getRequestUnionCase();
}