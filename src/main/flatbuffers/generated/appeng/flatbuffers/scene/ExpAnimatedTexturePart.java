// automatically generated by the FlatBuffers compiler, do not modify

package appeng.flatbuffers.scene;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@javax.annotation.processing.Generated(value="flatc")
@SuppressWarnings("unused")
public final class ExpAnimatedTexturePart extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static ExpAnimatedTexturePart getRootAsExpAnimatedTexturePart(ByteBuffer _bb) { return getRootAsExpAnimatedTexturePart(_bb, new ExpAnimatedTexturePart()); }
  public static ExpAnimatedTexturePart getRootAsExpAnimatedTexturePart(ByteBuffer _bb, ExpAnimatedTexturePart obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ExpAnimatedTexturePart __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String textureId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer textureIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer textureIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int x() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateX(int x) { int o = __offset(6); if (o != 0) { bb.putInt(o + bb_pos, x); return true; } else { return false; } }
  public int y() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateY(int y) { int o = __offset(8); if (o != 0) { bb.putInt(o + bb_pos, y); return true; } else { return false; } }
  public long width() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateWidth(long width) { int o = __offset(10); if (o != 0) { bb.putInt(o + bb_pos, (int) width); return true; } else { return false; } }
  public long height() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateHeight(long height) { int o = __offset(12); if (o != 0) { bb.putInt(o + bb_pos, (int) height); return true; } else { return false; } }
  public String framesPath() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer framesPathAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer framesPathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public long frameCount() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateFrameCount(long frame_count) { int o = __offset(16); if (o != 0) { bb.putInt(o + bb_pos, (int) frame_count); return true; } else { return false; } }
  public long framesPerRow() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateFramesPerRow(long frames_per_row) { int o = __offset(18); if (o != 0) { bb.putInt(o + bb_pos, (int) frames_per_row); return true; } else { return false; } }
  public appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame frames(int j) { return frames(new appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame(), j); }
  public appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame frames(appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame obj, int j) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o) + j * 4, bb) : null; }
  public int framesLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame.Vector framesVector() { return framesVector(new appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame.Vector()); }
  public appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame.Vector framesVector(appeng.flatbuffers.scene.ExpAnimatedTexturePartFrame.Vector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createExpAnimatedTexturePart(FlatBufferBuilder builder,
      int textureIdOffset,
      int x,
      int y,
      long width,
      long height,
      int framesPathOffset,
      long frameCount,
      long framesPerRow,
      int framesOffset) {
    builder.startTable(9);
    ExpAnimatedTexturePart.addFrames(builder, framesOffset);
    ExpAnimatedTexturePart.addFramesPerRow(builder, framesPerRow);
    ExpAnimatedTexturePart.addFrameCount(builder, frameCount);
    ExpAnimatedTexturePart.addFramesPath(builder, framesPathOffset);
    ExpAnimatedTexturePart.addHeight(builder, height);
    ExpAnimatedTexturePart.addWidth(builder, width);
    ExpAnimatedTexturePart.addY(builder, y);
    ExpAnimatedTexturePart.addX(builder, x);
    ExpAnimatedTexturePart.addTextureId(builder, textureIdOffset);
    return ExpAnimatedTexturePart.endExpAnimatedTexturePart(builder);
  }

  public static void startExpAnimatedTexturePart(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addTextureId(FlatBufferBuilder builder, int textureIdOffset) { builder.addOffset(0, textureIdOffset, 0); }
  public static void addX(FlatBufferBuilder builder, int x) { builder.addInt(1, x, 0); }
  public static void addY(FlatBufferBuilder builder, int y) { builder.addInt(2, y, 0); }
  public static void addWidth(FlatBufferBuilder builder, long width) { builder.addInt(3, (int) width, (int) 0L); }
  public static void addHeight(FlatBufferBuilder builder, long height) { builder.addInt(4, (int) height, (int) 0L); }
  public static void addFramesPath(FlatBufferBuilder builder, int framesPathOffset) { builder.addOffset(5, framesPathOffset, 0); }
  public static void addFrameCount(FlatBufferBuilder builder, long frameCount) { builder.addInt(6, (int) frameCount, (int) 0L); }
  public static void addFramesPerRow(FlatBufferBuilder builder, long framesPerRow) { builder.addInt(7, (int) framesPerRow, (int) 0L); }
  public static void addFrames(FlatBufferBuilder builder, int framesOffset) { builder.addOffset(8, framesOffset, 0); }
  public static void startFramesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 2); }
  public static int endExpAnimatedTexturePart(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ExpAnimatedTexturePart get(int j) { return get(new ExpAnimatedTexturePart(), j); }
    public ExpAnimatedTexturePart get(ExpAnimatedTexturePart obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

