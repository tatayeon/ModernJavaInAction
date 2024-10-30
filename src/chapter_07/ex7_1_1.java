//package chapter_07;
//
//
////import org.openjdk.jmh.annotations.*;
////
////import java.util.concurrent.TimeUnit;
////import java.util.stream.Stream;
////
////@BenchmarkMode(Mode.AverageTime)
////@OutputTimeUnit(TimeUnit.MILLISECONDS)
////@Fork(value = 2, jvmArgs = {"-Xms4g", "-Xmx4G"})
////@State(Scope.Benchmark)
//public class ex7_1_1 {
//
////    private static final long N = 10_000_000L;
////
////    @Benchmark
////    public long sequentialSum() {
////        return Stream.iterate(1L, i -> i + 1).limit(N)
////                .reduce(0L, Long::sum);
////    }
////
////    @TearDown(Level.Invocation)
////    public void tearDown() {
////        System.gc();
////    }
////
////    public static void main(String[] args) throws Exception {
////        org.openjdk.jmh.Main.main(args); // JMH 벤치마크 실행
//    }
//}
