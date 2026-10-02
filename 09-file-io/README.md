# File I/O

Status: **Not done**

Use this checklist as the minimum scope for this chapter. Study the theory separately and write the programs yourself. The filenames below describe planned work; they do not exist yet.

## Minimum theory to cover

- [ ] Byte streams versus character streams and explicit character encodings
- [ ] FileReader, FileWriter, buffering, and resource management
- [ ] Path, Files, directory operations, and modern NIO APIs
- [ ] Reading, writing, appending, copying, moving, and deleting files
- [ ] Large-file processing and closing lazily read file streams
- [ ] Serialization, Serializable, transient, serialVersionUID, and deserialization risks

## Minimum programs to write

Create these examples in `code/`. Each example may use supporting classes, packages, or test fixtures as needed. Verify normal behavior and relevant edge/error cases.

- [ ] `FileReaderDemo.java` — Read text with an explicit encoding and close the reader.
- [ ] `BufferedReaderDemo.java` — Process text line by line and handle empty input.
- [ ] `FileWriterDemo.java` — Write and append text with an explicit encoding.
- [ ] `ByteStreamDemo.java` — Copy binary content using byte streams.
- [ ] `SerializationDemo.java` — Round-trip a trusted local Serializable object and observe transient fields.
- [ ] `NioDemo.java` — Use Path/Files for read/write, directory listing, copy, and move operations inside a temporary directory.
- [ ] `LargeFileDemo.java` — Process a file incrementally and close the resources on success and failure.

## Revision checks

- [ ] Choose a byte or character API for a text file and a binary file.
- [ ] Explain how your examples handle encoding, missing files, and resource cleanup.
- [ ] Review serialization limitations and risks before considering external input.
- [ ] Re-run the examples and explain their results without notes.
- [ ] Record mistakes and revision points in your own notes.
- [ ] Update this chapter's status and the [root progress table](../README.md).

[Back to revision map](../README.md)

