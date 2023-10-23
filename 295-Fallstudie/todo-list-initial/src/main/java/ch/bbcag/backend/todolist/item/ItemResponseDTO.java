package ch.bbcag.backend.todolist.item;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class ItemResponseDTO extends ItemRequestDTO {

    private Integer id;
    private Timestamp createdAt;

    /*----------------- start neu unsicher -------------------- */
    private List<Integer> tagIds;

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }
    /*----------------- ende neu unsicher -------------------- */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ItemResponseDTO that = (ItemResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(tagIds, that.tagIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, tagIds);
    }
}
