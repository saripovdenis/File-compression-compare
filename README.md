# Files_compression_compare
Compare different types of compression to transfer files between servers

- Для сжатия изображений и видео лучше всего подойдут DEFLATE и GZ компрессии(хотя изображения уже сжатые и особо смысла в этом нет)

- Смысла сжимать .zip файлы файловыми компрессиями нет

- Файл с абсолютно случайными данными не компрессится

- Прежде чем сжать в .zip текст, выгоднее сначала сжать с помощью BZIP2

- Для звуковых .wav файлов так же следует использовать DEFLATE и GZ(mp3 так же уже сжат и особо смысла сжимать его нет);

result:

____ DEFLATE(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 388,242188 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 69 ms
Time of decompressing: 22 ms


____ LZMA(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 389,603516 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 386 ms
Time of decompressing: 236 ms


____ BZIP2(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 391,158203 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 376 ms
Time of decompressing: 159 ms


____ GZ(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 388,253906 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 23 ms
Time of decompressing: 8 ms


____ LZ4(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 390,889648 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 464 ms
Time of decompressing: 57 ms


____ SNAPPY(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 389,954102 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 165 ms
Time of decompressing: 115 ms


____ XZ(winter.jpg) ____
Original size: 393,180664 Kb
Compressed size: 388,789063 Kb
Decompressed size: 393,180664 Kb
Time of compressing: 748 ms
Time of decompressing: 89 ms


____ DEFLATE(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3348,764648 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 256 ms
Time of decompressing: 100 ms


____ LZMA(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3354,080078 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 3108 ms
Time of decompressing: 1484 ms


____ BZIP2(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3339,819336 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 1544 ms
Time of decompressing: 495 ms


____ GZ(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3348,776367 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 151 ms
Time of decompressing: 30 ms


____ LZ4(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3363,708008 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 751 ms
Time of decompressing: 32 ms


____ SNAPPY(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3360,499023 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 482 ms
Time of decompressing: 89 ms


____ XZ(city.jpg) ____
Original size: 3363,689453 Kb
Compressed size: 3347,082031 Kb
Decompressed size: 3363,689453 Kb
Time of compressing: 1330 ms
Time of decompressing: 285 ms


____ DEFLATE(1) ____
Original size: 51200,000000 Kb
Compressed size: 51215,625977 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 2365 ms
Time of decompressing: 465 ms


____ LZMA(1) ____
Original size: 51200,000000 Kb
Compressed size: 51859,668945 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 22842 ms
Time of decompressing: 7717 ms


____ BZIP2(1) ____
Original size: 51200,000000 Kb
Compressed size: 51426,339844 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 9649 ms
Time of decompressing: 7021 ms


____ GZ(1) ____
Original size: 51200,000000 Kb
Compressed size: 51215,637695 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 2966 ms
Time of decompressing: 296 ms


____ LZ4(1) ____
Original size: 51200,000000 Kb
Compressed size: 51200,065430 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 3862 ms
Time of decompressing: 312 ms


____ SNAPPY(1) ____
Original size: 51200,000000 Kb
Compressed size: 51213,778320 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 1836 ms
Time of decompressing: 597 ms


____ XZ(1) ____
Original size: 51200,000000 Kb
Compressed size: 51202,441406 Kb
Decompressed size: 51200,000000 Kb
Time of compressing: 23562 ms
Time of decompressing: 569 ms


____ DEFLATE(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 7753,423828 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 720 ms
Time of decompressing: 92 ms


____ LZMA(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 4137,071289 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 2364 ms
Time of decompressing: 599 ms


____ BZIP2(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 7787,549805 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 1704 ms
Time of decompressing: 891 ms


____ GZ(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 7753,435547 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 343 ms
Time of decompressing: 37 ms


____ LZ4(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 7772,445313 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 528 ms
Time of decompressing: 52 ms


____ SNAPPY(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 7752,590820 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 255 ms
Time of decompressing: 68 ms


____ XZ(arch.zip) ____
Original size: 7774,752930 Kb
Compressed size: 4103,671875 Kb
Decompressed size: 7774,752930 Kb
Time of compressing: 2071 ms
Time of decompressing: 127 ms


____ DEFLATE(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 341,586914 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 15 ms
Time of decompressing: 3 ms


____ LZMA(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 345,940430 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 162 ms
Time of decompressing: 59 ms


____ BZIP2(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 343,517578 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 85 ms
Time of decompressing: 29 ms


____ GZ(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 341,598633 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 12 ms
Time of decompressing: 2 ms


____ LZ4(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 341,492188 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 20 ms
Time of decompressing: 2 ms


____ SNAPPY(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 341,593750 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 12 ms
Time of decompressing: 2 ms


____ XZ(Vojna_i_mir.zip) ____
Original size: 341,473633 Kb
Compressed size: 341,546875 Kb
Decompressed size: 341,473633 Kb
Time of compressing: 90 ms
Time of decompressing: 7 ms


____ DEFLATE(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 349,399414 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 133 ms
Time of decompressing: 12 ms


____ LZMA(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 258,581055 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 1324 ms
Time of decompressing: 38 ms


____ BZIP2(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 223,884766 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 211 ms
Time of decompressing: 99 ms


____ GZ(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 349,411133 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 122 ms
Time of decompressing: 11 ms


____ LZ4(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 389,802734 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 31785 ms
Time of decompressing: 579 ms


____ SNAPPY(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 473,745117 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 347 ms
Time of decompressing: 616 ms


____ XZ(Vojna_i_mir.txt) ____
Original size: 1244,040039 Kb
Compressed size: 258,664063 Kb
Decompressed size: 1244,040039 Kb
Time of compressing: 1155 ms
Time of decompressing: 36 ms


____ DEFLATE(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 204,516602 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 11 ms
Time of decompressing: 3 ms


____ LZMA(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 204,472656 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 66 ms
Time of decompressing: 26 ms


____ BZIP2(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 207,297852 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 53 ms
Time of decompressing: 24 ms


____ GZ(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 204,528320 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 13 ms
Time of decompressing: 3 ms


____ LZ4(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 206,970703 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 23 ms
Time of decompressing: 2 ms


____ SNAPPY(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 206,651367 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 9 ms
Time of decompressing: 3 ms


____ XZ(patrick.gif) ____
Original size: 206,952148 Kb
Compressed size: 204,542969 Kb
Decompressed size: 206,952148 Kb
Time of compressing: 79 ms
Time of decompressing: 25 ms


____ DEFLATE(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 10971,157227 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 556 ms
Time of decompressing: 142 ms


____ LZMA(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 10985,039063 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 4240 ms
Time of decompressing: 1733 ms


____ BZIP2(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 10986,240234 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 2021 ms
Time of decompressing: 1097 ms


____ GZ(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 10971,168945 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 593 ms
Time of decompressing: 118 ms


____ LZ4(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 11002,867188 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 4616 ms
Time of decompressing: 207 ms


____ SNAPPY(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 11001,942383 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 555 ms
Time of decompressing: 276 ms


____ XZ(yung_lean.mp4) ____
Original size: 11036,945313 Kb
Compressed size: 10975,644531 Kb
Decompressed size: 11036,945313 Kb
Time of compressing: 5133 ms
Time of decompressing: 575 ms


____ DEFLATE(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 2939,003906 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 323 ms
Time of decompressing: 145 ms


____ LZMA(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 2511,407227 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 2713 ms
Time of decompressing: 361 ms


____ BZIP2(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 2596,334961 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 783 ms
Time of decompressing: 390 ms


____ GZ(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 2939,015625 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 295 ms
Time of decompressing: 52 ms


____ LZ4(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 3406,606445 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 108909 ms
Time of decompressing: 1283 ms


____ SNAPPY(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 3592,044922 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 547 ms
Time of decompressing: 1072 ms


____ XZ(Nick_Mira_sample.wav) ____
Original size: 4654,482422 Kb
Compressed size: 2511,816406 Kb
Decompressed size: 4654,482422 Kb
Time of compressing: 2490 ms
Time of decompressing: 345 ms


____ DEFLATE(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2337,259766 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 112 ms
Time of decompressing: 33 ms


____ LZMA(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2342,431641 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 674 ms
Time of decompressing: 285 ms


____ BZIP2(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2336,118164 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 414 ms
Time of decompressing: 225 ms


____ GZ(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2337,271484 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 107 ms
Time of decompressing: 26 ms


____ LZ4(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2343,477539 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 358 ms
Time of decompressing: 56 ms


____ SNAPPY(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2349,489258 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 82 ms
Time of decompressing: 51 ms


____ XZ(lil_peep.mp3) ____
Original size: 2346,121094 Kb
Compressed size: 2342,910156 Kb
Decompressed size: 2346,121094 Kb
Time of compressing: 661 ms
Time of decompressing: 274 ms



Process finished with exit code 0
