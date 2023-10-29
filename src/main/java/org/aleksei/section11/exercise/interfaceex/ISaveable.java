package org.aleksei.section11.exercise.interfaceex;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> strings);
}
