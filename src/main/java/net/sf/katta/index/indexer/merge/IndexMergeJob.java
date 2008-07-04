package net.sf.katta.index.indexer.merge;

import org.apache.hadoop.fs.Path;

public class IndexMergeJob {


  public static void main(String[] args) throws Exception {

    Path kattaIndices = new Path(args[0]);

    Path dedupPath = new Path("/tmp/katta.index.dedup");

    IndexToSequenceFileJob indexToSequenceFileJob = new IndexToSequenceFileJob();
    indexToSequenceFileJob.indexToSequenceFile(kattaIndices, dedupPath);

    SequenceFileToIndexJob sequenceFileToIndexJob = new SequenceFileToIndexJob();
    sequenceFileToIndexJob.sequenceFileToIndex(dedupPath);

  }


}