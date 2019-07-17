package com.glutton.cms.busi.category;

import com.glutton.cms.collection.GMap;
import com.glutton.cms.dao.category.Category;

import java.util.Iterator;
import java.util.Map;

/**
 * @Author: lijun_isf
 */
public class CategoryItem implements Iterator<CategoryItem> {
    private Map<Integer, CategoryItem> subCategories = new GMap();
    private Iterator<Integer> keys = subCategories.keySet().iterator();
    private Category category;

    public CategoryItem(){

    }

    public CategoryItem(Category category){
        this.category = category;
    }



    @Override
    public boolean hasNext() {
        return keys.hasNext();
    }

    @Override
    public CategoryItem next() {
        Integer key = keys.next();
        return subCategories.get(key);
    }

    public void addCategory(Category category){
        if(category.getParentId() == 0){
            this.category = category;
        }else if(subCategories.isEmpty()){
            subCategories.put(category.getParentId(), new CategoryItem(category));
        }else{
            addCategoryItem(this, category);
        }
    }


    public void addCategoryItem(CategoryItem parentItem, Category category){
        for(Map.Entry<Integer, CategoryItem> item : subCategories.entrySet()){
            CategoryItem currentItem = item.getValue();
            if(currentItem.getCategory().getParentId() == category.getParentId()){
                subCategories.put(category.getParentId(), new CategoryItem(category));
            }else if(currentItem.getCategory().getParentId() == category.getcId()){
                parentItem.setCategory(category);
            }else if(currentItem.hasNext()){
                addCategoryItem(currentItem, category);
            }
        }
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public Category getCategory(){
        return this.category;
    }
}
